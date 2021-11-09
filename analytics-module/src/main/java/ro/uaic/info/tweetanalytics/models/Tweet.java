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
@Document(indexName="order")
public class Tweet {

    @ApiModelProperty(notes = "The id of a Tweet - unique")
    @Id
    @Field
    private int id;

    @ApiModelProperty(notes = "The text of a tweet")
    @Field
    private String text;

    @ApiModelProperty(notes = "The feedback for a tweet")
    @Field
    private List<Feedback> feedbackList;


    public Tweet(@NonNull String text) {
        this.text = text;
    }


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
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
