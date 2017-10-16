/*
Name: Jarryd Pretorius
Student No: 206155247
*/

package TutorialPlannerApp.domain;

public class Tutorial 
{
    private String tutorialID;
    private String tutorialTypeID;
    private String subjectID;
    private String venueID;
    private String tutorialName;
    private String summary;
    private String tutorialDate;
    private String tutorialTime;

    public Tutorial() 
    {
    }

    public String getTutorialID() {
        return tutorialID;
    }

    public String getTutorialTypeID() {
        return tutorialTypeID;
    }

    public String getSubjectID() {
        return subjectID;
    }

    public String getVenueID() {
        return venueID;
    }
    
    public String getTutorialName() {
        return tutorialName;
    }
    
    public String getSummary() {
        return summary;
    }
    
    public String getTutorialDate() {
        return tutorialDate;
    }
    
    public String getTutorialTime() {
        return tutorialTime;
    }

    public Tutorial (Builder builder)
    {
        this.tutorialID = builder.tutorialID;
        this.tutorialTypeID = builder.tutorialTypeID;
        this.subjectID = builder.subjectID;
        this.venueID = builder.venueID;
        this.tutorialName = builder.tutorialName;
        this.summary = builder.summary;
        this.tutorialDate = builder.tutorialDate;
        this.tutorialTime = builder.tutorialTime;
    }  

    public static class Builder {

        private String tutorialID;
        private String tutorialTypeID;
        private String subjectID;
        private String venueID;
        private String tutorialName;
        private String summary;
        private String tutorialDate;
        private String tutorialTime;

        public Builder tutorialID(String value) {
            this.tutorialID = value;
            return this;
        }

        public Builder tutorialTypeID(String value) {
            this.tutorialTypeID = value;
            return this;
        }

        public Builder subjectID(String value) {
            this.subjectID = value;
            return this;
        }

        public Builder venueID(String value) {
            this.venueID = value;
            return this;
        }
        
        public Builder tutorialName(String value) {
            this.tutorialName = value;
            return this;
        }
        
        public Builder summary(String value) {
            this.summary = value;
            return this;
        }
        
        public Builder tutorialDate(String value) {
            this.tutorialDate = value;
            return this;
        }
        
        public Builder tutorialTime(String value) {
            this.tutorialTime = value;
            return this;
        }

        public Tutorial build() {
            return new Tutorial(this);
        }
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tutorial tutorial = (Tutorial) o;

        return tutorialID.equals(tutorial.tutorialID);
    }

    @Override
    public int hashCode() {
        return tutorialID.hashCode();
    }
}
