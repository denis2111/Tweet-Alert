import string

from .tokens_collection import TokensCollection
from .custom_token import *
from nltk.tokenize import word_tokenize


class Tokenizer:
    _state = None

    def __init__(self, tweet_text: str) -> None:
        self._tweet_text = tweet_text

    def get_tokens_collection(self) -> TokensCollection:
        tokens_list = word_tokenize(self._tweet_text)
        for index, raw_token in enumerate(tokens_list):
            if raw_token in string.punctuation:
                token = Token(TokenType.punctuation_mark, raw_token)
            elif len(raw_token.split(" ")) > 1:
                token = Token(TokenType.composed, raw_token)
            else:
                token = Token(TokenType.simple, raw_token)
            tokens_list[index] = token
        return TokensCollection(tokens_list)

    def delete_stop_words(self):
        pass

    def lemmatizing(self):
        pass