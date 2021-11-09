class TokenType:
    composed = "COMPOSED"
    simple = "SIMPLE"
    punctuation_mark = "PUNCTUATION_MARK"


class Token:
    def __init__(self, token_type: TokenType, token_text: str) -> None:
        self._token_type = token_type
        self._token_text = token_text

    def __str__(self) -> str:
        return f"{self._token_type} + {self._token_text}"

    def get_token(self) -> (TokenType, str):
        return self._token_type, self._token_text
