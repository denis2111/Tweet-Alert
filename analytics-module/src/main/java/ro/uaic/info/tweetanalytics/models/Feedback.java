package ro.uaic.info.tweetanalytics.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;


@ApiModel(description = "All details about the feedback ")
@Getter
@Setter
@NoArgsConstructor
@Document(indexName="order")
public class Feedback {
    @ApiModelProperty(notes = "The id of feedback - unique")
    @Id
    @Field
    private int id;

    @ApiModelProperty(notes = "The content of a feedback")
    @Field
    private String text;

    @ApiModelProperty(notes = "The tweet it belongs to")
    @JsonIgnore
    @Field
    private Tweet tweet;


    public Feedback(String text, Tweet tweet) {
        this.text = text;
        this.tweet = tweet;
    }

    public Feedback(String text) {
        this.text = text;
    }

}
