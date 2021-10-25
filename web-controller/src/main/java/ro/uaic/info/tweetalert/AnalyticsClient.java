package ro.uaic.info.tweetalert;

import ro.uaic.info.tweetalert.models.LocalizedResponse;

import java.util.logging.Logger;

public class AnalyticsClient {
    private static final Logger LOG = Logger.getLogger(ImageClassifierClient.class.getName());
    private static AnalyticsClient analyticsClient = null;

    private AnalyticsClient() { }

    public AnalyticsClient getAnalyticsClient(){
        LOG.info("AnalyticsClient created!");
        if (analyticsClient == null) {
            analyticsClient = new AnalyticsClient();
        }
        return analyticsClient;
    }

    public boolean checkImageExistence(String image){
        return false;
    }

    public boolean checkTextExistence(String text){
        return false;
    }

    public void persistImage(String image, LocalizedResponse localizedResponse){

    }

    public void persistText(String text, LocalizedResponse localizedResponse){

    }
}
