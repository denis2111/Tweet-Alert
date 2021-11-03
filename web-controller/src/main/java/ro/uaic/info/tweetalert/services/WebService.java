package ro.uaic.info.tweetalert.services;

import org.springframework.http.ResponseEntity;
import ro.uaic.info.tweetalert.models.LocalizedResponse;
import ro.uaic.info.tweetalert.models.TweetReq;

public interface WebService {
    ResponseEntity<LocalizedResponse> classify(TweetReq tweetReq);
}
