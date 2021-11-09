package ro.uaic.info.tweetanalytics.DTOs;

import lombok.Getter;
import lombok.Setter;


public class FeedbackDTO {
    private String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
