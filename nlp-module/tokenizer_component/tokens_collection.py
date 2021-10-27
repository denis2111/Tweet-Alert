from collections import Iterable
from typing import List
from .custom_token import Token
from .tokens_iterator import TokensIterator


class TokensCollection(Iterable):
    def __init__(self, collection: List[Token] = None) -> None:
        if collection is None:
            collection = []
        self._collection = collection

    def __getitem__(self, item: int) -> Token:
        return self._collection[item]

    def __iter__(self) -> TokensIterator:
        return TokensIterator(self._collection)

    def get_reverse_iterator(self) -> TokensIterator:
        return TokensIterator(self._collection, True)

    def add_item(self, item: Token) -> None:
        self._collection.append(item)
