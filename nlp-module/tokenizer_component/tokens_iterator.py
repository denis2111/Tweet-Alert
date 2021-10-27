from collections import Iterator
from typing import List
from .custom_token import Token


class TokensIterator(Iterator):
    def __init__(self, collection: List[Token], reverse: bool = False) -> None:
        self._collection = collection
        self._reverse = reverse
        self._position = -1 if reverse else 0

    def __next__(self) -> str:
        try:
            value = self._collection[self._position]
            self._position += -1 if self._reverse else 1
        except IndexError:
            raise StopIteration()

        return str(value)
