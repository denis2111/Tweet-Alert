package ro.uaic.info.tweetalert;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TweetalertApplication {

  @RequestMapping("/")
  public String home() {
    return "This is the Web Controller.";
  }

  public static void main(String[] args) {
    SpringApplication.run(TweetalertApplication.class, args);
  }

}