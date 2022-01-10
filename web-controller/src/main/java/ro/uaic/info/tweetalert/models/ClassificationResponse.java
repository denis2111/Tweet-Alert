package ro.uaic.info.tweetalert.models;


public class ClassificationResponse 
implements ClassifyResponse
{
    DisasterType classificationLabel;

    float precision;

    
    public ClassificationResponse(DisasterType classificationLabel, float precision)
    {
       this.classificationLabel = classificationLabel;
       this.precision = precision;
    }
   
    public DisasterType getClassificationLabel()
    {
       return classificationLabel;
    } 

    public void setClassificationLabel(DisasterType classificationLabel)
    {
      this.classificationLabel = classificationLabel;
    }

    @Override
    public float getPrecision()
    {
       return precision;
    }

    public void setPrecision(float precision)
    {
       this.precision = precision;
    }
    
}
