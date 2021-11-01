package ro.uaic.info.tweetalert.models;

import lombok.Data;

@Data
public class LocalizedResponse implements ClassifyResponse{
    ClassificationResponse classificationResponse;
    String location;

    public LocalizedResponse(ClassificationResponse response){
        this.classificationResponse = response;
    }

    public float getPrecision(){
        return classificationResponse.getPrecision();
    }
}
