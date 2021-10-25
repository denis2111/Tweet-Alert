package ro.uaic.info.tweetalert.models;

import lombok.Data;

@Data
public class LocalizedResponse implements Response{
    Response response;
    String location;

    public LocalizedResponse(Response response){
        this.response = response;
    }

    public float getPrecision(){
        return response.getPrecision();
    }
}
