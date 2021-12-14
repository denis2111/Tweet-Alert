import json

import keras.models
import pandas as pd

import numpy as np
from keras_preprocessing.text import tokenizer_from_json
from text_parser_component.text_parser import TextParser

from sklearn import model_selection

import tensorflow as tf
from tensorflow.keras.models import Model
from tensorflow.keras.preprocessing.text import Tokenizer
from tensorflow.keras.preprocessing.sequence import pad_sequences
from tensorflow.keras.layers import Conv1D, Bidirectional, LSTM, Dense, Dropout, Input
from tensorflow.keras.optimizers import Adam


def save_keras_tokenizer(keras_tokenizer: Tokenizer):
    tokenizer_json = keras_tokenizer.to_json()
    with open('binary_classifier_component/nlp_keras_tokenizer/tokenizer.json', 'w', encoding='utf-8') as f:
        f.write(json.dumps(tokenizer_json, ensure_ascii=False))


def load_keras_tokenizer() -> Tokenizer:
    with open('binary_classifier_component/nlp_keras_tokenizer/tokenizer.json') as f:
        data = json.load(f)
        keras_tokenizer = tokenizer_from_json(data)
    return keras_tokenizer


class BinaryClassifier:
    # region Singleton
    __instance = None

    @staticmethod
    def get_instance():
        if BinaryClassifier.__instance is None:
            BinaryClassifier()
        return BinaryClassifier.__instance

    def __init__(self):
        self.model = None
        self.path_to_glove_file = 'resources/glove.6B.300d.txt'
        self.embedding_dim = 300
        self.learning_rate = 1e-3
        self.batch_size = 1024
        self.epochs = 20
        self.sequence_len = 100

        if BinaryClassifier.__instance is not None:
            raise Exception("Singleton Class")
        else:
            BinaryClassifier.__instance = self

    # endregion

    def load_model(self):
        self.model = keras.models.load_model('binary_classifier_component/nlp_model/nlp_model.h5')

    def create_model_and_train(self) -> None:
        cleaning_options = [TextParser.remove_urls,
                            TextParser.remove_numbers,
                            TextParser.remove_spatial_chr_and_stopwords,
                            TextParser.lemmatize_text]
        raw_data = pd.read_csv("train_files/train.csv")

        # remove tweets under 3 words
        raw_data['word_count'] = raw_data['text'].apply(lambda text: len(text.split(" ")))
        raw_data = raw_data[raw_data['word_count'] > 2]
        raw_data = raw_data.reset_index()

        # clean data and keywords
        raw_data['clean_text'] = raw_data['text'].apply(
            lambda text: TextParser.clean_and_process_text(text, cleaning_options))
        raw_data['keyword'] = raw_data['keyword'].fillna("none")
        raw_data['clean_keyword'] = raw_data['keyword'].apply(
            lambda text: TextParser.clean_and_process_text(text, cleaning_options))

        # combine column 'clean_keyword' and 'clean_text' into one
        raw_data['keyword_text'] = raw_data['clean_keyword'] + " " + raw_data["clean_text"]

        feature = "keyword_text"
        label = "target"

        # split train and test
        x_train, x_test, y_train, y_test = model_selection.train_test_split(raw_data[feature],
                                                                            raw_data[label],
                                                                            test_size=0.2,
                                                                            random_state=0,
                                                                            shuffle=True)

        # Define train and test labels
        y_train_lstm = y_train.values.reshape(-1, 1)
        y_test_lstm = y_test.values.reshape(-1, 1)
        print("Training Y shape:", y_train_lstm.shape)
        print("Testing Y shape:", y_test_lstm.shape)

        # Tokenize train data
        tokenizer = Tokenizer()
        tokenizer.fit_on_texts(x_train)

        word_index = tokenizer.word_index
        vocab_size = len(word_index) + 1
        print("Vocabulary Size: ", vocab_size)

        # Pad train and test
        x_train = pad_sequences(tokenizer.texts_to_sequences(x_train), maxlen=self.sequence_len)
        x_test = pad_sequences(tokenizer.texts_to_sequences(x_test), maxlen=self.sequence_len)
        print("Training X shape: ", x_train.shape)
        print("Testing X shape: ", x_test.shape)

        # Read word embeddings
        embeddings_index = {}
        with open(self.path_to_glove_file, mode="r", encoding="utf-8") as f:
            for line in f:
                word, coefs = line.split(maxsplit=1)
                coefs = np.fromstring(coefs, "f", sep=" ")
                embeddings_index[word] = coefs
        print("Found %s word vectors." % len(embeddings_index))

        # Define embedding layer in Keras
        embedding_matrix = np.zeros((vocab_size, self.embedding_dim))
        for word, i in word_index.items():
            embedding_vector = embeddings_index.get(word)
            if embedding_vector is not None:
                embedding_matrix[i] = embedding_vector

        embedding_layer = tf.keras.layers.Embedding(vocab_size,
                                                    self.embedding_dim,
                                                    weights=[embedding_matrix],
                                                    input_length=self.sequence_len,
                                                    trainable=False)

        # Define model architecture
        sequence_input = Input(shape=(self.sequence_len,), dtype='int32')
        embedding_sequences = embedding_layer(sequence_input)

        x = Conv1D(128, 5, activation='relu')(embedding_sequences)
        x = Bidirectional(LSTM(128, dropout=0.5, recurrent_dropout=0.2))(x)
        x = Dense(512, activation='relu')(x)
        x = Dropout(0.5)(x)
        x = Dense(512, activation='relu')(x)
        outputs = Dense(1, activation='sigmoid')(x)
        model = Model(sequence_input, outputs)
        model.summary()

        # Optimize the model
        model.compile(optimizer=Adam(learning_rate=self.learning_rate), loss='binary_crossentropy',
                      metrics=['accuracy'])

        # Train the LSTM Model
        model.fit(x_train,
                  y_train,
                  batch_size=self.batch_size,
                  epochs=self.epochs,
                  validation_data=(x_test, y_test))

        save_keras_tokenizer(tokenizer)
        model.save('nlp_model/nlp_model.h5')

    def predict(self, keyword: str, tweet: str) -> (str, float):
        self.load_model()
        # Evaluate the model
        cleaning_options = [TextParser.remove_urls,
                            TextParser.remove_numbers,
                            TextParser.remove_spatial_chr_and_stopwords,
                            TextParser.lemmatize_text]
        tweet = TextParser.clean_and_process_text(tweet, cleaning_options)
        x_test = [keyword + " " + tweet]
        tokenizer = load_keras_tokenizer()

        x_test = pad_sequences(tokenizer.texts_to_sequences(x_test), maxlen=self.sequence_len)
        predicted = self.model.predict(x_test, verbose=1, batch_size=10000)
        y_predicted = "DISASTER" if predicted[0] > 0.5 else "NON_DISASTER"
        y_accuracy = float(predicted[0][0]) if predicted[0] > 0.5 else 1 - float(predicted[0][0])
        return y_predicted, y_accuracy


if __name__ == "__main__":
    binary_classifier = BinaryClassifier.get_instance()
    print(binary_classifier.predict("fire", "Forest fire near La Ronge Sask"))
