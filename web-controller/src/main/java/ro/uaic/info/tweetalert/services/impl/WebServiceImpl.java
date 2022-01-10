package ro.uaic.info.tweetalert.services.impl;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import ro.uaic.info.tweetalert.AnalyticsClient;
import ro.uaic.info.tweetalert.ImageClassifierClient;
import ro.uaic.info.tweetalert.NLPClassifierClient;
import ro.uaic.info.tweetalert.models.DisasterType;
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

        try {

            LocalizedResponse localizedResponse = analyticsClient.getCachedVerdict(tweetReq);

            if (localizedResponse != null) {
                return new ResponseEntity<>(localizedResponse, HttpStatus.OK);
            }

            localizedResponseNLP = nlpClassifierClient.classify(tweetReq);
            if (localizedResponseNLP.getClassificationResponse().getClassificationLabel().equals(DisasterType.DISASTER))
            {
               if (tweetReq.getImage() != null && !tweetReq.getImage().trim().isEmpty()) 
               {
                   localizedResponseImage = Optional.of(imageClassifierClient.classify(tweetReq));
                   
                   if (localizedResponseImage.isPresent())
                   {
                      analyticsClient.persistTweet(tweetReq, localizedResponseImage.get());
                      return new ResponseEntity<>(localizedResponseImage.get(), HttpStatus.OK);
                   }
               }
            }
            
            analyticsClient.persistTweet(tweetReq, localizedResponseNLP);
            return new ResponseEntity<>(localizedResponseImage.get(), HttpStatus.OK);

        } catch (HttpClientErrorException.BadRequest e){
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }
}
