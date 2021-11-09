package ro.uaic.info.tweetalert.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import static ro.uaic.info.tweetalert.utils.ValidationParameters.*;

@Data
@AllArgsConstructor
public class TweetReq {
    @NotNull (message = WRONG_TWEET_TEXT_MESSAGE)
    @Size (max = MAX_TEXT_SIZE, min = 1, message = WRONG_TWEET_TEXT_SIZE_MESSAGE)
    private final String text;

    private final String image;
}
