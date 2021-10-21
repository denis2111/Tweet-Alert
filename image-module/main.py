from flask import Flask
from train import train
from predict import predict
import tensorflow as tf


app = Flask(__name__)

@app.route('/')
def hello_world():
	return 'Hello World - this is the image module'

@app.route('/classify_raw')
def classify_raw(raw_image):
	predict()
	return 'classify_raw'

@app.route('/classify')
def classify(image):
	predict()
	return 'classify'

@app.route('/train')
def train():
	train()
	return 'training'

if __name__ == '__main__':
	app.run(host="0.0.0.0", debug=True)