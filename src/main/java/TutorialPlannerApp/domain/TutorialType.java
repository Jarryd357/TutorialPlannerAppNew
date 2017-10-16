/*
Name: Jarryd Pretorius
Student No: 206155247
*/

package TutorialPlannerApp.domain;

public class TutorialType 
{
    private String tutorialTypeID;
    private String tutorialTypeName;
    private String duration;

    public TutorialType() 
    {
    }

    public String getTutorialTypeID() {
        return tutorialTypeID;
    }

    public String getTutorialTypeName() {
        return tutorialTypeName;
    }

    public String getDuration() {
        return duration;
    }

    public TutorialType (Builder builder)
    {
        this.tutorialTypeID = builder.tutorialTypeID;
        this.tutorialTypeName = builder.tutorialTypeName;
        this.duration = builder.duration;
    }  

    public static class Builder {

        private String tutorialTypeID;
        private String tutorialTypeName;
        private String duration;

        public Builder tutorialTypeID(String value) {
            this.tutorialTypeID = value;
            return this;
        }

        public Builder tutorialTypeName(String value) {
            this.tutorialTypeName = value;
            return this;
        }

        public Builder duration(String value) {
            this.duration = value;
            return this;
        }

        public TutorialType build() {
            return new TutorialType(this);
        }
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TutorialType tutorialType = (TutorialType) o;

        return tutorialTypeID.equals(tutorialType.tutorialTypeID);
    }

    @Override
    public int hashCode() {
        return tutorialTypeID.hashCode();
    }
}
