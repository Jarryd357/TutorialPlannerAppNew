/*
Name: Jarryd Pretorius
Student No: 206155247
*/

package TutorialPlannerApp.domain;

public class TutorialAttendees 
{
    private String attendeeID;
    private String tutorialID;
    private String studentID;
    private String studentName;
    private boolean isPresent;;

    public TutorialAttendees() 
    {
    }

    public String getTutorialAttendeeID() {
        return attendeeID;
    }

    public String getTutorialID() {
        return tutorialID;
    }

    public String getStudentID() {
        return studentID;
    }
    
     public String getStudentName() {
        return studentName;
    }

    public Boolean getIsPresent() {
        return isPresent;
    }

    public TutorialAttendees (Builder builder)
    {
        this.attendeeID = builder.attendeeID;
        this.tutorialID = builder.tutorialID;
        this.studentID = builder.studentID;
        this.studentName = builder.studentName;
        this.isPresent = builder.isPresent;
    }  

    public static class Builder {

        private String attendeeID;
        private String tutorialID;
        private String studentID;
        private String studentName;
        private boolean isPresent;

        public Builder attendeeID(String value) {
            this.attendeeID = value;
            return this;
        }

        public Builder tutorialID(String value) {
            this.tutorialID = value;
            return this;
        }

        public Builder studentID(String value) {
            this.studentID = value;
            return this;
        }

        public Builder studentName(String value) {
            this.studentName = value;
            return this;
        }
        
        public Builder isPresent(boolean value) {
            this.isPresent = value;
            return this;
        }
        
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TutorialAttendees tutorialAttendees = (TutorialAttendees) o;

        return attendeeID.equals(tutorialAttendees.attendeeID);
    }

    @Override
    public int hashCode() {
        return attendeeID.hashCode();
    }
}
