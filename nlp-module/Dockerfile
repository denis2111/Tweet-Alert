FROM tensorflow/tensorflow:latest
ADD . /nlp-module
WORKDIR /nlp-module
RUN pip install -r requirements.txt
RUN python -m nltk.downloader punkt 
RUN python -m nltk.downloader stopwords
RUN python -m nltk.downloader wordnet