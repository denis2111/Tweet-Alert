

class BinaryClassifier:
    # region Singleton
    __instance = None

    @staticmethod
    def get_instance():
        if BinaryClassifier.__instance is None:
            BinaryClassifier()
        return BinaryClassifier.__instance

    def __init__(self):

        if BinaryClassifier.__instance is not None:
            raise Exception("Singleton Class")
        else:
            BinaryClassifier.__instance = self

    # endregion

    def train_model(self, data):
        pass


if __name__ == "__main__":
    pass
