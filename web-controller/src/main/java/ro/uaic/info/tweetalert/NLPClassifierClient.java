package ro.uaic.info.tweetalert;

import ro.uaic.info.tweetalert.models.LocalizedResponse;
import ro.uaic.info.tweetalert.models.TweetReq;

import java.util.logging.Logger;

public class NLPClassifierClient implements ClassifierClient{
    private static final Logger LOG = Logger.getLogger(NLPClassifierClient.class.getName());
    private static NLPClassifierClient nlpClassifierClient = null;


    private NLPClassifierClient() { }

    public NLPClassifierClient getNlpClassifierClient() {
        if (nlpClassifierClient == null) {
            LOG.info("NLPClassifierClient created!");
            nlpClassifierClient = new NLPClassifierClient();
        }

        return nlpClassifierClient;
    }

    @Override
    public LocalizedResponse classify(TweetReq tweetReq) {
        return null;
    }
}
