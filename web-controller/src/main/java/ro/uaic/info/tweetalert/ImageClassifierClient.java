package ro.uaic.info.tweetalert;

import ro.uaic.info.tweetalert.models.LocalizedResponse;
import ro.uaic.info.tweetalert.models.TweetReq;

import java.util.logging.Logger;

public class ImageClassifierClient implements ClassifierClient{
    private static final Logger LOG = Logger.getLogger(ImageClassifierClient.class.getName());
    private static ImageClassifierClient imageClassifierClient = null;

    private ImageClassifierClient() { }

    public ImageClassifierClient getImageClassifierClient(){
        LOG.info("ImageClassifierClient created!");
        if (imageClassifierClient == null) {
            imageClassifierClient = new ImageClassifierClient();
        }
        return imageClassifierClient;
    }

    @Override
    public LocalizedResponse classify(TweetReq tweetReq) {
        return null;
    }
}
