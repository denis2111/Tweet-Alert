package ro.uaic.info.tweetalert.services.impl;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import ro.uaic.info.tweetalert.models.ClassificationRes;
import ro.uaic.info.tweetalert.models.TweetReq;
import ro.uaic.info.tweetalert.services.WebService;

@Service
public class WebServiceImpl implements WebService {

    @Override
    public ResponseEntity<ClassificationRes> classify(TweetReq tweetReq) {
        return new ResponseEntity<>(new ClassificationRes("merge"), HttpStatus.OK);
    }
}
