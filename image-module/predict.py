import random


def predict(image):
    labels = ["CYCLONE", "FLOOD", "EARTHQUAKE", "WILDFIRE", "NO_DISASTER"]

    return random.choice(labels), random.random()
