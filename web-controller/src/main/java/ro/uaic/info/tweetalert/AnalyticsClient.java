package ro.uaic.info.tweetalert;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.web.client.HttpClientErrorException;
import ro.uaic.info.tweetalert.models.ClassificationResponse;
import ro.uaic.info.tweetalert.models.DisasterType;
import ro.uaic.info.tweetalert.models.LocalizedResponse;
import ro.uaic.info.tweetalert.models.TweetReq;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.logging.Logger;

public class AnalyticsClient {
    private static final Logger LOG = Logger.getLogger(ImageClassifierClient.class.getName());
    private static final String ANALYTICS_URL = System.getenv("ANALYTICS_MODULE_HOST") != null ? System.getenv("ANALYTICS_MODULE_HOST") + "/api/v1/tweets" : "http://localhost:8089/api/v1/tweets";
    private static AnalyticsClient analyticsClient = null;

    private AnalyticsClient() { }

    public static AnalyticsClient getAnalyticsClient(){
        LOG.info("AnalyticsClient created!");
        if (analyticsClient == null) {
            analyticsClient = new AnalyticsClient();
        }
        return analyticsClient;
    }

    /**
     * Request json:
     * {
     *     image: "https://play-lh.googleusercontent.com/aFWiT2lTa9CYBpyPjfgfNHd0r5puwKRGj2rHpdPTNrz2N9LXgN_MbLjePd1OTc0E8Rl1"
     *     text: "text a,b,c"
     * }
     * In the future we can make a copy for this image and use the link for the internal copy.
     *
     * Response json:
     * {
     *     exists: true,
     *     label: "FLOOD",
     *     precision: 0.87
     * }
     * label name is from DisasterType
     * **/
    public LocalizedResponse getCachedVerdict(TweetReq tweetReq){
        String requestBody = String.format("{\"image\": \"%s\", \"text\": \"%s\"}", tweetReq.getImage(), tweetReq.getText());
        LOG.info(String.format("Request: %s", requestBody));
        String response = analyticsRequest("/getCachedTweet", requestBody, "POST");
        LOG.info(String.format("Response: %s", response));

        JSONObject responseJSON = new JSONObject(response);

        if (!responseJSON.getBoolean("exists")){
            return null;
        }

        return new LocalizedResponse(responseJSON);
    }

    /**
     * Request json:
     * {
     *     tweet:{
     *          image: "https://play-lh.googleusercontent.com/aFWiT2lTa9CYBpyPjfgfNHd0r5puwKRGj2rHpdPTNrz2N9LXgN_MbLjePd1OTc0E8Rl1",
     *          text: "text a,b,c"
     *     },
     *     verdict:{
     *         label: "FLOOD",
     *         precision: 0.87
     *     }
     * }
     * label name is from DisasterType
     * **/
    public void persistTweet(TweetReq tweet, LocalizedResponse localizedResponse){
        String image = tweet.getImage();
        String text = tweet.getText();
        String label = localizedResponse.getClassificationResponse().getClassificationLabel().toString();
        Float precision = localizedResponse.getClassificationResponse().getPrecision();

        String responseBody = String.format("{\"tweet\": {\"image\": \"%s\", \"text\": \"%s\"}, " +
                "\"verdict\": {\"label\": \"%s\", \"precision\": %f}}", image, text, label, precision);
        LOG.info(responseBody);
        String response = analyticsRequest("/createTweet", responseBody, "POST");

        JSONObject responseJSON = new JSONObject(response);
    }

    public String analyticsRequest(String path, String requestBody, String method) {
        String response = "";
        try {
            URL url = new URL(ANALYTICS_URL + path);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod(method);
            con.setRequestProperty("Content-Type", "application/json");
            con.setRequestProperty("Accept", "*/*");
            con.setRequestProperty("Accept-Encoding", "*");
            con.setRequestProperty("Accept-Language", "*");

            con.setConnectTimeout(5000);

            con.setDoOutput(true);

            try(OutputStream os = con.getOutputStream()) {
                byte[] input = requestBody.getBytes(StandardCharsets.UTF_8);
                os.write(input, 0, input.length);
            }

            int status = con.getResponseCode();
            if (status != 200 && status!= 201) {
                String message = con.getResponseMessage();
                LOG.warning(String.format("Status: %d, message: %s", status, message));
                throw HttpClientErrorException.create(HttpStatus.valueOf(status), message, HttpHeaders.EMPTY, new byte[0], Charset.defaultCharset());
            }

            try(BufferedReader br = new BufferedReader(
                    new InputStreamReader(con.getInputStream(), StandardCharsets.UTF_8))) {
                StringBuilder responseBuilder = new StringBuilder();
                String responseLine;
                while ((responseLine = br.readLine()) != null) {
                    responseBuilder.append(responseLine.trim());
                }
                response = responseBuilder.toString();
            }
        } catch (IOException e) {
            LOG.severe(String.format("Error on connecting to analytics module: %s", e.getMessage()));
        }

        return response;
    }
}
