from flask import Flask, request
from network import train
import json
from PIL import Image
import requests
import network



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

	else:
		"Panic"

	model = network.get_trained_model()
	label, precision = network.predict(model, image)

	response = {
		"label": label,
		"precision": str(precision)
	}

	return json.dumps(response)


@app.route('/train')
def train():
	train()
	return 'training'


if __name__ == '__main__':
	app.run(host="0.0.0.0", debug=True)