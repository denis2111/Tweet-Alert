from tokenizer_component.tokenizer import Tokenizer
from tokenizer_component.tweet_text_state import *
from translator.translator import Translator


class DisasterType:
    flood = "FLOOD"
    cyclone = "CYCLONE"
    earthquake = "EARTHQUAKE"
    wildfire = "WILDFIRE"
    no_disaster = "NO_DISASTER"


class NLPController:
    def __init__(self, tokenizer: Tokenizer) -> None:
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

    def classify_multi_label(self, tweet_text) -> (DisasterType, float):
        translated_text = Translator.get_en_translation(tweet_text)
        print(translated_text)
        return DisasterType.no_disaster


if __name__ == '__main__':
    local_tokenizer = Tokenizer(GetTokensState(), "test")
    nlpController = NLPController(local_tokenizer)
