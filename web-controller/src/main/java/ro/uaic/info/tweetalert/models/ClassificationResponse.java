package ro.uaic.info.tweetalert.models;

import lombok.Data;

@Data
public class ClassificationResponse implements Response{
    DisasterType classificationLabel;
    float precision;
}
