from tokenizer_component.tokenizer import Tokenizer
from tokenizer_component.tweet_text_state import *


class NLPController:
    def __init__(self, tokenizer: Tokenizer):
        self._tokenizer = tokenizer
        self.test()

    def test(self):
        # Tokens list after first state
        print("Tokens list after first state")
        self._tokenizer.parse_tweet()
        print("\n".join(self._tokenizer.get_tokens_collection()))
        print("\n")

        # Tokens list afer second state
        print("Tokens list after second state")
        self._tokenizer.parse_tweet()
        print("\n".join(self._tokenizer.get_tokens_collection()))
        print("\n")

        # Tokens list after third state
        print("Tokens list after second state")
        self._tokenizer.parse_tweet()
        print("\n".join(self._tokenizer.get_tokens_collection()))


if __name__ == '__main__':
    tokenizer = Tokenizer(GetTokensState(), "test")
    nlpController = NLPController(tokenizer)
