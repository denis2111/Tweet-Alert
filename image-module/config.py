import os

# region general data
DATASET_PATH = "dataset"

INPUT_SHAPE = [180, 180, 3]
LABELS = ["CYCLONE", "EARTHQUAKE", "FLOOD", "WILDIFRE", "NON_DISASTER"]
MODEL_PATH = os.path.sep.join(["model", "natural_disaster.h5"]) # path where the model will be saved
# endregion

# region tune parameters
EPOCHS = 1
BATCH_SIZE = 32

# endregion
