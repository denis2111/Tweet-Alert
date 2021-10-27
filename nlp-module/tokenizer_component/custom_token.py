from enum import Enum


class TokenType(Enum):
    COMPOSED = 1
    SIMPLE = 0


class Token:
    def __init__(self, token_type: TokenType, is_punctuation_mark: bool) -> None:
        self._token_type = token_type
        self._is_punctuation_mark = is_punctuation_mark

    def __str__(self):
        return f"{self._token_type} + {self._is_punctuation_mark}"

    def get_token_type(self) -> TokenType:
        return self._token_type

    def get_is_punctuation_mark(self) -> bool:
        return self._is_punctuation_mark
