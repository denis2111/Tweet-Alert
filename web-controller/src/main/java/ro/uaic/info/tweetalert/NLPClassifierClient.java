package ro.uaic.info.tweetalert;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.web.client.HttpClientErrorException;
import ro.uaic.info.tweetalert.models.ClassificationResponse;
import ro.uaic.info.tweetalert.models.DisasterType;
import ro.uaic.info.tweetalert.models.LocalizedResponse;
import ro.uaic.info.tweetalert.models.TweetReq;

import java.nio.charset.Charset;
import java.util.logging.Logger;

public class NLPClassifierClient extends ClassifierClient{
    private static final Logger LOG = Logger.getLogger(NLPClassifierClient.class.getName());
    private static NLPClassifierClient nlpClassifierClient = null;


    private NLPClassifierClient() { }

    public static NLPClassifierClient getNlpClassifierClient() {
        if (nlpClassifierClient == null) {
            LOG.info("NLPClassifierClient created!");
            nlpClassifierClient = new NLPClassifierClient();
        }

        return nlpClassifierClient;
    }

    @Override
    public LocalizedResponse classify(TweetReq tweetReq){
        if (tweetReq.getText() == null || tweetReq.getText().equals("")) {
            throw HttpClientErrorException.create(HttpStatus.BAD_REQUEST, "Bad request", HttpHeaders.EMPTY, new byte[0], Charset.defaultCharset());
        }

        ClassificationResponse classificationResponse = new ClassificationResponse(DisasterType.NO_DISASTER, 0.4f);
        return new LocalizedResponse(classificationResponse);
    }
}
