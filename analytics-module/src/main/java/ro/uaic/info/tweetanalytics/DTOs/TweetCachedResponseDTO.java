package ro.uaic.info.tweetanalytics.DTOs;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
public class TweetCachedResponseDTO {
    private boolean exists;
    private String label;
    private float precision;

}
