
import network

from tensorflow.python.keras.preprocessing.image import image_dataset_from_directory

from config import *


def train(dataset_path = DATASET_PATH):
    train_set = image_dataset_from_directory(
        directory=r"./dataset/train",
        image_size=(INPUT_SHAPE[0], INPUT_SHAPE[1]),
        color_mode="rgb",
        batch_size=BATCH_SIZE,
        label_mode='categorical',
        shuffle=True
    )

    test_set = image_dataset_from_directory(
        directory=r"./dataset/test",
        image_size=(INPUT_SHAPE[0], INPUT_SHAPE[1]),
        color_mode="rgb",
        batch_size=BATCH_SIZE,
        label_mode='categorical',
        shuffle=True
    )

    model = network.get_model()
    network.train(model, train_set)
    model.save(MODEL_PATH)


if __name__ == "__main__":
    train()

