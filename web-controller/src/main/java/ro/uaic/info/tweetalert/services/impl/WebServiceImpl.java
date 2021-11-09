package ro.uaic.info.tweetalert.services.impl;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import ro.uaic.info.tweetalert.ImageClassifierClient;
import ro.uaic.info.tweetalert.NLPClassifierClient;
import ro.uaic.info.tweetalert.models.LocalizedResponse;
import ro.uaic.info.tweetalert.models.TweetReq;
import ro.uaic.info.tweetalert.services.WebService;

@Service
public class WebServiceImpl implements WebService {
    NLPClassifierClient nlpClassifierClient;
    ImageClassifierClient imageClassifierClient;

    public WebServiceImpl(){
        nlpClassifierClient = NLPClassifierClient.getNlpClassifierClient();
        imageClassifierClient = ImageClassifierClient.getImageClassifierClient();
    }


    @Override
    public ResponseEntity<LocalizedResponse> classify(TweetReq tweetReq) {
        LocalizedResponse localizedResponseNLP;
        LocalizedResponse localizedResponseImage;
        try {
            localizedResponseNLP = nlpClassifierClient.classify(tweetReq);
            if (tweetReq.getImage() != null && tweetReq.getImage().equals("")) {
                localizedResponseImage = imageClassifierClient.classify(tweetReq);
                return new ResponseEntity<>(localizedResponseImage, HttpStatus.OK);
            }
            return new ResponseEntity<>(localizedResponseNLP, HttpStatus.OK);
        } catch (HttpClientErrorException.BadRequest e){
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }
}
