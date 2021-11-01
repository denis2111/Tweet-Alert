package ro.uaic.info.tweetalert.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ClassificationResponse implements ClassifyResponse{
    DisasterType classificationLabel;
    float precision;
}
