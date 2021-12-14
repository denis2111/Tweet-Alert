import json

from flask import Flask, request

from nlp_controller import NLPController

app = Flask(__name__)


@app.route('/')
def hello_world():
	return 'Hello World - this is the nlp module'


@app.route('/classify', methods=['POST'])
def classify():
	data = request.get_json()
	tweet_text = data["tweet_text"]

	nlp_controller = NLPController()
	prediction = nlp_controller.get_prediction(tweet_text)
	print(prediction)
	response = {
		"label": prediction[0],
		"precision": prediction[1]
	}

	return json.dumps(response)


if __name__ == '__main__':
	app.run(host="0.0.0.0", debug=True)
