package ro.uaic.info.tweetanalytics.models;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;

import java.util.Collection;
import java.util.List;

@ApiModel(description = "All details about the Subject ")
@Getter
@Setter
@NoArgsConstructor
@Document(indexName="tweet")
public class Tweet {

	 @ApiModelProperty(notes = "The hash of a tweet")
	 @Id
	 @Field
	 private String hash;

    @ApiModelProperty(notes = "The text of a tweet")
    @Field
    private String text;

	@ApiModelProperty(notes = "The image of a tweet")
	@Field
	private String image;

	@ApiModelProperty(notes = "The label of a tweet")
	@Field
	private String label;

	@ApiModelProperty(notes = "The precision of verdict")
	@Field
	private float precision;

    @ApiModelProperty(notes = "The feedback for a tweet")
    @Field
    private List<Feedback> feedbackList;


    public Tweet(@NonNull String text) {
        this.text = text;
    }


	public String getText() {
		return text;
	}


	public void setText(String text) {
		this.text = text;
	}


	public List<Feedback> getFeedbackList() {
		return feedbackList;
	}


	public void setFeedbackList(List<Feedback> feedbackList) {
		this.feedbackList = feedbackList;
	}


}
