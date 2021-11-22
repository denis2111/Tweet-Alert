import json

from flask import Flask, request

app = Flask(__name__)

@app.route('/')
def hello_world():
	return 'Hello World - this is the nlp module'

@app.route('/classify', methods=['POST'])
def classify():
	data = request.get_json()

	response = {
		"label": "CYCLONE",
		"precision": 123
	}

	return json.dumps(response)

if __name__ == '__main__':
	app.run(host="0.0.0.0", debug=True)