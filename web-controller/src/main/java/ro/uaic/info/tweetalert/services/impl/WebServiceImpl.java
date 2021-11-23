package ro.uaic.info.tweetalert.services.impl;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import ro.uaic.info.tweetalert.AnalyticsClient;
import ro.uaic.info.tweetalert.ImageClassifierClient;
import ro.uaic.info.tweetalert.NLPClassifierClient;
import ro.uaic.info.tweetalert.models.LocalizedResponse;
import ro.uaic.info.tweetalert.models.TweetReq;
import ro.uaic.info.tweetalert.services.WebService;

@Service
public class WebServiceImpl implements WebService {
    NLPClassifierClient nlpClassifierClient;
    ImageClassifierClient imageClassifierClient;
    AnalyticsClient analyticsClient;

    public WebServiceImpl(){
        nlpClassifierClient = NLPClassifierClient.getNlpClassifierClient();
        imageClassifierClient = ImageClassifierClient.getImageClassifierClient();
        analyticsClient = AnalyticsClient.getAnalyticsClient();
    }


    @Override
    public ResponseEntity<LocalizedResponse> classify(TweetReq tweetReq) {
        LocalizedResponse localizedResponseNLP;
        LocalizedResponse localizedResponseImage;
        try {
            if (tweetReq.getImage() != null && !tweetReq.getImage().equals("")) {
                LocalizedResponse localizedResponse = analyticsClient.getImage(tweetReq.getImage());
                if (localizedResponse != null) {
                    return new ResponseEntity<>(localizedResponse, HttpStatus.OK);
                }
                localizedResponseImage = imageClassifierClient.classify(tweetReq);
                analyticsClient.persistTweet(tweetReq, localizedResponseImage);
                return new ResponseEntity<>(localizedResponseImage, HttpStatus.OK);
            }
            LocalizedResponse localizedResponse = analyticsClient.getText(tweetReq.getText());
            if (localizedResponse != null){
                return new ResponseEntity<>(localizedResponse, HttpStatus.OK);
            }
            localizedResponseNLP = nlpClassifierClient.classify(tweetReq);
            analyticsClient.persistTweet(tweetReq, localizedResponseNLP);
            return new ResponseEntity<>(localizedResponseNLP, HttpStatus.OK);
        } catch (HttpClientErrorException.BadRequest e){
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }
}
