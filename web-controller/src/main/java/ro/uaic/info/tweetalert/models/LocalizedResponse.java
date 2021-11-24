package ro.uaic.info.tweetalert.models;

import lombok.Data;
import lombok.ToString;
import org.json.JSONObject;

@Data
@ToString
public class LocalizedResponse implements ClassifyResponse{
    ClassificationResponse classificationResponse;
    String location;

    public LocalizedResponse(JSONObject object){
        String label = object.getString("label");
        float precision = object.getFloat("precision");
        classificationResponse = new ClassificationResponse(DisasterType.valueOf(label), precision);
        location = "";
    }

    public LocalizedResponse(ClassificationResponse response){
        this.classificationResponse = response;
    }

    public float getPrecision(){
        return classificationResponse.getPrecision();
    }
}
