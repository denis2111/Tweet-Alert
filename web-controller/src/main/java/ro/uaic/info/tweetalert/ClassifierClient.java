package ro.uaic.info.tweetalert;

import ro.uaic.info.tweetalert.models.LocalizedResponse;
import ro.uaic.info.tweetalert.models.TweetReq;

public interface ClassifierClient {
    LocalizedResponse classify(TweetReq tweetReq);
}
