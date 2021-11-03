package ro.uaic.info.tweetalert;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import ro.uaic.info.tweetalert.models.TweetReq;
import ro.uaic.info.tweetalert.services.impl.WebServiceImpl;

import java.util.logging.Logger;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(TweetalertApplication.class)
class TweetalertApplicationTests {
	private static final Logger LOG = Logger.getLogger(TweetalertApplicationTests.class.getName());
	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private WebServiceImpl service;

	@Test
	void ClassifyShouldReturnAResponseForCorrectRequest() throws Exception {
		String tweetText = "This is the text.";
		String tweetImage = "https://www.google.com/url?sa=i&url=https%3A%2F%2Fif-koubou.com%2Farticles%2Fhow-to%2Fwhat-is-a-url-uniform-resource-locator.html&psig=AOvVaw0EwnOCbgtJoY9EJc5zsaIl&ust=1635879427115000&source=images&cd=vfe&ved=0CAsQjRxqFwoTCKiuuvTr9_MCFQAAAAAdAAAAABAD";

		String tweetReq = String.format("{\"text\": \"%s\", \"image\": \"%s\"}", tweetText, tweetImage);

		this.mockMvc.perform(get("/api/v1/classify").contentType(MediaType.APPLICATION_JSON).content(tweetReq)).andExpect(status().isOk());

		String emptyImage = "";
		tweetReq = String.format("{\"text\": \"%s\", \"image\": \"%s\"}", tweetText, emptyImage);
		this.mockMvc.perform(get("/api/v1/classify").contentType(MediaType.APPLICATION_JSON).content(tweetReq)).andExpect(status().isOk());

		String nullImage = null;
		tweetReq = String.format("{\"text\": \"%s\", \"image\": \"%s\"}", tweetText, nullImage);
		this.mockMvc.perform(get("/api/v1/classify").contentType(MediaType.APPLICATION_JSON).content(tweetReq)).andExpect(status().isOk());
	}

	@Test
	void ClassifyShouldReturnBadRequestForIncorrectRequest() throws Exception {
		String tweetText = "This is a too long text. AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
		String tweetImage = "https://www.google.com/url?sa=i&url=https%3A%2F%2Fif-koubou.com%2Farticles%2Fhow-to%2Fwhat-is-a-url-uniform-resource-locator.html&psig=AOvVaw0EwnOCbgtJoY9EJc5zsaIl&ust=1635879427115000&source=images&cd=vfe&ved=0CAsQjRxqFwoTCKiuuvTr9_MCFQAAAAAdAAAAABAD";

		String tweetReq = String.format("{\"text\": \"%s\", \"image\": \"%s\"}", tweetText, tweetImage);
		this.mockMvc.perform(get("/api/v1/classify").contentType(MediaType.APPLICATION_JSON).content(tweetReq)).andExpect(status().isBadRequest());

		String emptyText = "";
		tweetReq = String.format("{\"text\": \"%s\", \"image\": \"%s\"}", tweetText, emptyText);
		this.mockMvc.perform(get("/api/v1/classify").contentType(MediaType.APPLICATION_JSON).content(tweetReq)).andExpect(status().isBadRequest());
	}

	@Test
	void RequestNonExistentPath() throws Exception {
		this.mockMvc.perform(get("/api/v1/does_not_exists")).andExpect(status().isNotFound());
	}

}
