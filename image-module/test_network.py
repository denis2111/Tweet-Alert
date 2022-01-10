import network
from PIL import Image
import requests
import tensorflow

def test_predict_wildfire():
    url = "https://i.pinimg.com/originals/cc/8e/20/cc8e20a6b6643ec02b26f905f383a823.jpg"
    image = Image.open(requests.get(url, stream=True).raw)
    image = image.convert("RGB")

    model = network.get_trained_model()
    
    label, precision = network.predict(model, image)
    assert(label == "WILDIFRE")
    assert(precision >= 0.9)

def test_predict_flood():
    url = "https://www.ready.gov/sites/default/files/2020-04/Flooded-neighborhood_1.jpg"
    image = Image.open(requests.get(url, stream=True).raw)
    image = image.convert("RGB")

    model = network.get_trained_model()
    
    label, precision = network.predict(model, image)
    assert(label == "FLOOD")
    assert(precision >= 0.8)

def test_predict_earthquake():
    url = "https://www.aljazeera.com/wp-content/uploads/2021/08/2021-08-15T020705Z_1173683348_RC2E5P9KWO4T_RTRMADP_3_HAITI-QUAKE.jpg?resize=770%2C513"
    image = Image.open(requests.get(url, stream=True).raw)
    image = image.convert("RGB")

    model = network.get_trained_model()
    
    label, precision = network.predict(model, image)
    assert(label == "EARTHQUAKE")
    assert(precision >= 0.9)

def test_predict_huricane():
    url = "https://www.noaa.gov/sites/default/files/styles/landscape_width_1275/public/legacy/image/2019/Sep/Humberto_hero_logo.jpg?h=8efce669&itok=gQB9hP3x"
    image = Image.open(requests.get(url, stream=True).raw)
    image = image.convert("RGB")

    model = network.get_trained_model()
    
    label, precision = network.predict(model, image)
    assert(label == "CYCLONE")
    assert(precision >= 0.9)
