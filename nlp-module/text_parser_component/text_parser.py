import re
from typing import List, Any

import nltk
from nltk.corpus import stopwords
from nltk.tokenize import word_tokenize
from nltk.stem import SnowballStemmer
from nltk.stem import WordNetLemmatizer


# nltk.download()


class TextParser:
    # region Singleton
    __instance = None

    @staticmethod
    def get_instance():
        if TextParser.__instance is None:
            TextParser()
        return TextParser.__instance

    def __init__(self):
        if TextParser.__instance is not None:
            raise Exception("Singleton Class")
        else:
            TextParser.__instance = self

    # endregion

    @staticmethod
    def clean_and_process_text(text: str, options: List[Any]) -> str:
        final_text = text
        for option in options:
            final_text = option(final_text)
        return final_text

    @staticmethod
    def remove_urls(text: str) -> str:
        return re.sub(r"http\S+", "", text)

    @staticmethod
    def remove_numbers(text: str) -> str:
        return re.sub(r'\d+', '', text)

    @staticmethod
    def tokenize(text: str) -> List[str]:
        return word_tokenize(text)

    @staticmethod
    def remove_spatial_chr_and_stopwords(text: str) -> str:
        word_tokens = TextParser.tokenize(text)
        stop_words = set(stopwords.words('english'))
        clean_text = []
        # remove spatial chr
        for word in word_tokens:
            clean_text.append(''.join([e for e in word if e.isalnum()]))
        # remove stop words
        clean_text = [w.lower() for w in clean_text if w not in stop_words and w != '']
        return ' '.join(clean_text)

    @staticmethod
    def lemmatize_text(text: str) -> str:
        word_tokens = TextParser.tokenize(text)
        wordnet_lemmatizer = WordNetLemmatizer()
        lemmatize_text = [wordnet_lemmatizer.lemmatize(w, pos='v') for w in word_tokens]
        return ' '.join(lemmatize_text)

    @staticmethod
    def stemming_text(text: str) -> str:
        word_tokens = TextParser.tokenize(text)
        stemmer = SnowballStemmer('english')
        stemmed_text = [stemmer.stem(w) for w in word_tokens]
        return ' '.join(stemmed_text)


if __name__ == '__main__':
    tweet = "approaches to apply but one simple approach that I have applied was to combine both of these two"
    cleaned_text = TextParser.get_instance().clean_and_process_text(tweet,
                                                                    [TextParser.remove_urls,
                                                                     TextParser.remove_numbers,
                                                                     TextParser.remove_spatial_chr_and_stopwords,
                                                                     TextParser.lemmatize_text])
    print(tweet)
    print(cleaned_text)
