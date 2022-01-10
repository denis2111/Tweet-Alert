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

public class NLPClassifierClient extends ClassifierClient{
    private static final Logger LOG = Logger.getLogger(NLPClassifierClient.class.getName());
    private static NLPClassifierClient nlpClassifierClient = null;


    private NLPClassifierClient() { }

    public static NLPClassifierClient getNlpClassifierClient() {
        if (nlpClassifierClient == null) {
            LOG.info("NLPClassifierClient created!");
            nlpClassifierClient = new NLPClassifierClient();
        }

        return nlpClassifierClient;
    }

    @Override
    public LocalizedResponse classify(TweetReq tweetReq){
        if (tweetReq.getText() == null || tweetReq.getText().equals("")) {
            throw HttpClientErrorException.create(HttpStatus.BAD_REQUEST, "Bad request", HttpHeaders.EMPTY, new byte[0], Charset.defaultCharset());
        }

        String response = "";
        try {
            String nlpHost = System.getenv("NLP_MODULE_HOST");
            URL url;
            if (nlpHost == null)
            {
               url = new URL("http://localhost:8102/classify");
            }
            else
            {
               url = new URL(nlpHost);
            }
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("POST");
            con.setRequestProperty("Content-Type", "application/json");
            con.setConnectTimeout(5000);

            con.setDoOutput(true);
            String jsonInputString = String.format("{\"tweet_text\": \"%s\"}", tweetReq.getText());

            try(OutputStream os = con.getOutputStream()) {
                byte[] input = jsonInputString.getBytes(StandardCharsets.UTF_8);
                os.write(input, 0, input.length);
            }

            int status = con.getResponseCode();
            if (status != 200){
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
            LOG.severe(String.format("Error on connecting to NLP module: %s", e.getMessage()));
        }

        JSONObject responseJSON = new JSONObject(response);

        LOG.info(String.format("Response: %s", response));

        String label = responseJSON.getString("label");
        DisasterType disasterType = DisasterType.valueOf(label);

        float precision;

        try{
            precision = responseJSON.getFloat("precision");
        } catch (JSONException e) {
            String precisionString = responseJSON.getString("precision");
            precision = Float.parseFloat(precisionString);
        }


        ClassificationResponse classificationResponse = new ClassificationResponse(disasterType, precision);
        return new LocalizedResponse(classificationResponse);
    }
}
