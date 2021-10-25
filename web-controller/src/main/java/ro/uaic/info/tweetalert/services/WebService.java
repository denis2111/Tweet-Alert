package ro.uaic.info.tweetalert.services;

import org.springframework.http.ResponseEntity;
import ro.uaic.info.tweetalert.models.ClassificationRes;
import ro.uaic.info.tweetalert.models.TweetReq;

public interface WebService {
    ResponseEntity<ClassificationRes> classify(TweetReq tweetReq);
}
