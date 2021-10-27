from .tokens_collection import TokensCollection
from .tweet_text_state import TweetTextState


class Tokenizer:
    _state = None

    def __init__(self, state, tweet_text: str) -> None:
        self._tokens_collection = TokensCollection()
        self._tweet_text = tweet_text
        self.transition_to(state)

    def get_tokens_collection(self) -> TokensCollection:
        return self._tokens_collection

    def transition_to(self, state):
        self._state = state
        self._state.context = self

    # Request based on state
    def parse_tweet(self):
        self._state.parse_tweet_handle(crt_tokens_collection=self._tokens_collection)
