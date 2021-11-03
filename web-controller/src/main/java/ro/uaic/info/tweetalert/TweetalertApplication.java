package ro.uaic.info.tweetalert;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ro.uaic.info.tweetalert.models.ClassifyResponse;
import ro.uaic.info.tweetalert.models.LocalizedResponse;
import ro.uaic.info.tweetalert.models.TweetReq;
import ro.uaic.info.tweetalert.services.WebService;

import javax.validation.Valid;

@SpringBootApplication
@RestController
@RequestMapping("api/v1")
public class TweetalertApplication {
  WebService webService;

  public TweetalertApplication(WebService webService){
    this.webService = webService;
  }

  @RequestMapping("/")
  public String home() {
    return "This is the Web Controller.";
  }

  @GetMapping("/classify")
  public ResponseEntity<LocalizedResponse> classify(@Valid @RequestBody TweetReq tweetReq) {
    return webService.classify(tweetReq);
  }

  public static void main(String[] args) {
    SpringApplication.run(TweetalertApplication.class, args);
  }

}