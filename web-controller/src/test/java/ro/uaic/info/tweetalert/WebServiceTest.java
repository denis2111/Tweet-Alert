package ro.uaic.info.tweetalert;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import ro.uaic.info.tweetalert.models.ClassifyResponse;
import ro.uaic.info.tweetalert.models.LocalizedResponse;
import ro.uaic.info.tweetalert.models.TweetReq;
import ro.uaic.info.tweetalert.services.WebService;

import static org.assertj.core.api.Assertions.as;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class WebServiceTest {

    @Autowired
    private WebService service;

    @Test
    public void WebServiceShouldReturnAnWellFormattedResponse(){
        String tweetText = "This is the text.";
        String tweetImage = "https://www.google.com/url?sa=i&url=https%3A%2F%2Fif-koubou.com%2Farticles%2Fhow-to%2Fwhat-is-a-url-uniform-resource-locator.html&psig=AOvVaw0EwnOCbgtJoY9EJc5zsaIl&ust=1635879427115000&source=images&cd=vfe&ved=0CAsQjRxqFwoTCKiuuvTr9_MCFQAAAAAdAAAAABAD";

        TweetReq tweetReq = new TweetReq(tweetText, tweetImage);
        ResponseEntity<LocalizedResponse> classifyRes = service.classify(tweetReq);
        CheckWellFormedOKResponse(classifyRes);
    }

    @Test
    public void WebServiceShouldWorkWithNullOrEmptyImage(){
        String tweetText = "This is the text for no image tweet.";
        String tweetImage = "";

        TweetReq tweetReq = new TweetReq(tweetText, tweetImage);
        ResponseEntity<LocalizedResponse> classifyRes = service.classify(tweetReq);
        CheckWellFormedOKResponse(classifyRes);

        tweetImage = null;
        TweetReq tweetReq2 = new TweetReq(tweetText, tweetImage);
        ResponseEntity<LocalizedResponse> classifyRes2 = service.classify(tweetReq2);
        CheckWellFormedOKResponse(classifyRes2);
    }

    @Test
    public void WebServiceShouldThrowAnExceptionIfTextIsNullOrEmpty(){
        String tweetText = "";
        String tweetImage = "https://www.google.com/url?sa=i&url=https%3A%2F%2Fif-koubou.com%2Farticles%2Fhow-to%2Fwhat-is-a-url-uniform-resource-locator.html&psig=AOvVaw0EwnOCbgtJoY9EJc5zsaIl&ust=1635879427115000&source=images&cd=vfe&ved=0CAsQjRxqFwoTCKiuuvTr9_MCFQAAAAAdAAAAABAD";

        TweetReq tweetReq = new TweetReq(tweetText, tweetImage);
        ResponseEntity<LocalizedResponse> classifyRes = service.classify(tweetReq);
        CheckBadRequestResponse(classifyRes);

        tweetText = null;
        TweetReq tweetReq2 = new TweetReq(tweetText, tweetImage);
        ResponseEntity<LocalizedResponse> classifyRes2 = service.classify(tweetReq2);
        CheckBadRequestResponse(classifyRes2);
    }

    private void CheckBadRequestResponse(ResponseEntity<LocalizedResponse>  classifyRes) {
        assertThat(classifyRes).isNotNull();
        assertThat(classifyRes.getStatusCode()).isEqualTo(HttpStatus.BAD_REQUEST);
    }

    private void CheckWellFormedOKResponse(ResponseEntity<LocalizedResponse> classifyRes){
        assertThat(classifyRes).isNotNull();
        assertThat(classifyRes.getStatusCode()).isEqualTo(HttpStatus.OK);

        LocalizedResponse localizedResponse = classifyRes.getBody();

        assertThat(localizedResponse).isNotNull();
        assertThat(localizedResponse.getPrecision()).isBetween(0f, 1f);
        assertThat(localizedResponse.getClassificationResponse()).isNotNull();
        assertThat(localizedResponse.getClassificationResponse().getClassificationLabel()).isNotNull();
    }
}
