from binary_classifier_component.binary_classifier import BinaryClassifier


def test_predict_disaster():
    text = "The Real fire in Australia burned all Forest"
    keyword = ""
    label, precision = BinaryClassifier.get_instance().predict(keyword, text)
    assert (label == "DISASTER")
    assert (precision >= 0.8)


def test_predict_non_disaster():
    text = "Sometimes you need to freshen things up a bit, like swapping colors, " \
           "super-sizing your text, or revisiting your dark mode selection, all of which you can do in your settings."
    keyword = ""
    label, precision = BinaryClassifier.get_instance().predict(keyword, text)
    assert (label == "NON_DISASTER")
    assert (precision >= 0.8)
