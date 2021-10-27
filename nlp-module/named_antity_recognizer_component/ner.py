from typing import List


class NER:
    def __init__(self, tokens_collection):
        self.tokens_collection = tokens_collection

    def get_names(self) -> List[str]:
        return ["Andre", "Claus"]

    def get_locations(self) -> List[str]:
        return ["Peru", "Chile"]

    def get_elements(self) -> List[str]:
        return ["Water", "Fire"]
