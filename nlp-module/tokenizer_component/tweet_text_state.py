from abc import ABC, abstractmethod
from .tokenizer import *
from .custom_token import *


class TweetTextState(ABC):
    @property
    def context(self):
        return self._context

    @context.setter
    def context(self, context) -> None:
        self._context = context

    @abstractmethod
    def parse_tweet_handle(self, crt_tokens_collection: TokensCollection) -> None:
        pass


class GetTokensState(TweetTextState):
    def parse_tweet_handle(self, crt_tokens_collection: TokensCollection) -> None:
        crt_token = Token(TokenType.SIMPLE, False)
        crt_tokens_collection.add_item(crt_token)
        self.context.transition_to(DeleteStopWordsState())


class DeleteStopWordsState(TweetTextState):
    def parse_tweet_handle(self, crt_tokens_collection: TokensCollection) -> None:
        crt_token = Token(TokenType.SIMPLE, True)
        crt_tokens_collection.add_item(crt_token)
        self.context.transition_to(LemmatizingTokensState())


class LemmatizingTokensState(TweetTextState):
    def parse_tweet_handle(self, crt_tokens_collection: TokensCollection) -> None:
        crt_token = Token(TokenType.COMPOSED, True)
        crt_tokens_collection.add_item(crt_token)
