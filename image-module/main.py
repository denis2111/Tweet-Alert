from flask import Flask, request
from train import train
from predict import predict
import json
from PIL import Image
import requests

import tensorflow as tf


app = Flask(__name__)


@app.route('/')
def hello_world():
	return 'Hello World - this is the image module'


@app.route('/classify', methods=['POST'])
def classify():
	data = request.get_json()

	image = ""
	if 'type' in data:
		type = data['type']

		image = ""
		if type == "LINK":
			url = data['image_path']

			image = Image.open(requests.get(url, stream=True).raw)

		print(image)
	else:
		"Panic"

	label, precision = predict(image)

	response = {
		"label": label,
		"precision": precision
	}

	return json.dumps(response)


@app.route('/train')
def train():
	train()
	return 'training'


if __name__ == '__main__':
	app.run(host="0.0.0.0", debug=True)