from tensorflow.python.keras import models
from tensorflow.python.keras.backend import expand_dims
from tensorflow.python.keras.layers import Conv2D, LayerNormalization, MaxPooling2D, Dropout, Flatten, Dense
from tensorflow.python.keras.optimizer_v2.gradient_descent import SGD
from tensorflow.python.keras.preprocessing.image import img_to_array, smart_resize

from config import *
import numpy as np


trained_model = None


def get_trained_model():
    global trained_model

    if not trained_model:
        trained_model = models.load_model(MODEL_PATH)

    return trained_model


def get_model():
    model = models.Sequential()
    model.add(Conv2D(30, (3, 3), activation='relu', kernel_initializer='random_normal', padding='same', input_shape=(INPUT_SHAPE[0], INPUT_SHAPE[1], INPUT_SHAPE[2])))
    model.add(LayerNormalization())
    model.add(Conv2D(30, (3, 3), activation='relu', kernel_initializer='random_normal', padding='same'))
    model.add(LayerNormalization())
    model.add(MaxPooling2D((2, 2), strides=2))
    model.add(Dropout(0.1))
    model.add(Conv2D(70, (3, 3), activation='relu', kernel_initializer='random_normal', padding='same'))
    model.add(LayerNormalization())
    model.add(Conv2D(70, (3, 3), activation='relu', kernel_initializer='random_normal', padding='same'))
    model.add(LayerNormalization())
    model.add(MaxPooling2D((2, 2), strides=2))
    model.add(Dropout(0.15))
    model.add(Conv2D(140, (3, 3), activation='relu', kernel_initializer='random_normal', padding='same'))
    model.add(LayerNormalization())
    model.add(Conv2D(140, (3, 3), activation='relu', kernel_initializer='random_normal', padding='same'))
    model.add(LayerNormalization())
    model.add(MaxPooling2D((2, 2), strides=2))
    model.add(Dropout(0.25))
    model.add(Flatten())
    model.add(Dense(128, activation='relu', kernel_initializer='random_normal'))
    model.add(LayerNormalization())
    model.add(Dropout(0.30))
    model.add(Dense(len(LABELS), activation='softmax'))
    opt = SGD(lr=0.001, momentum=0.9)
    model.compile(optimizer=opt, loss='categorical_crossentropy', metrics=['accuracy'])

    return model


def train(model, train_set):
    model.fit(train_set, epochs=EPOCHS, batch_size=BATCH_SIZE)

    return model


def predict(model, image):
    image = smart_resize(image, (INPUT_SHAPE[0], INPUT_SHAPE[1]))
    img_array = img_to_array(image)
    img_array = expand_dims(img_array, 0)  # Create batch axis

    predictions = model.predict(img_array)

    return LABELS[np.argmax(predictions)], np.max(predictions)
