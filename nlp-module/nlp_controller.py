from binary_classifier_component.binary_classifier import BinaryClassifier
from translator.translator import Translator


class NLPController:
    def __init__(self) -> None:
        # self.translator = Translator.get_instance()
        self.binary_classifier = BinaryClassifier.get_instance()

    def get_prediction(self, tweet) -> (str, float):
        prediction = self.binary_classifier.predict('none', tweet)
        return prediction


if __name__ == '__main__':
    local_tweet_text = "Forest fire near La Ronge Sask"
    nlp_controller = NLPController()
    local_prediction = nlp_controller.get_prediction(local_tweet_text)
    print(local_prediction)
