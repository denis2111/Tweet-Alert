package ro.uaic.info.tweetalert;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ro.uaic.info.tweetalert.models.LocalizedResponse;
import ro.uaic.info.tweetalert.models.TweetReq;
import ro.uaic.info.tweetalert.services.WebService;

@CrossOrigin(origins = "https://twitter.com", maxAge = 3600)
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

  /*@RequestMapping(value = "/classify", method = RequestMethod.POST, consumes="text/plain")
  public ResponseEntity<LocalizedResponse> classify(@RequestBody String stringInput) {
     System.err.println(stringInput);
     JSONObject obj = new JSONObject(stringInput);
     TweetReq req = new TweetReq(obj.getString("text"), obj.getString("image"));
     return this.classify(req);
  }*/

  @RequestMapping(value = "/classify", method = RequestMethod.POST, consumes="application/json")
  public ResponseEntity<LocalizedResponse> classify(@RequestBody TweetReq tweetReq) {
    return webService.classify(tweetReq);
  }

  public static void main(String[] args) {
    SpringApplication.run(TweetalertApplication.class, args);
  }

}