package ro.uaic.info.tweetalert.services.impl;

import org.json.JSONObject;
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

import java.util.Optional;
import java.util.logging.Logger;

@Service
public class WebServiceImpl implements WebService {
    private static final Logger LOG = Logger.getLogger(WebServiceImpl.class.getName());

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
        Optional<LocalizedResponse> localizedResponseImage = Optional.empty();
        LocalizedResponse bestLocalizedResponse;

        try {

            LocalizedResponse localizedResponse = analyticsClient.getCachedVerdict(tweetReq);

            if (localizedResponse != null) {
                return new ResponseEntity<>(localizedResponse, HttpStatus.OK);
            }

            if (tweetReq.getImage() != null && !tweetReq.getImage().equals("")) {
                localizedResponseImage = Optional.of(imageClassifierClient.classify(tweetReq));
            }

            localizedResponseNLP = nlpClassifierClient.classify(tweetReq);
            if (localizedResponseImage.isPresent()){
                bestLocalizedResponse = chooseBestLocalizedResponse(localizedResponseNLP, localizedResponseImage.get());
            } else {
                bestLocalizedResponse = localizedResponseNLP;
            }
            analyticsClient.persistTweet(tweetReq, bestLocalizedResponse);

            return new ResponseEntity<>(bestLocalizedResponse, HttpStatus.OK);
        } catch (HttpClientErrorException.BadRequest e){
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }

    private LocalizedResponse chooseBestLocalizedResponse(LocalizedResponse localizedResponseNLP, LocalizedResponse localizedResponse) {
        // TODO implement bestLocalizedResponse
        return localizedResponseNLP;
    }
}
