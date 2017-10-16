/*
Name: Jarryd Pretorius
Student No: 206155247
*/

package TutorialPlannerApp.domain;

public class Subject 
{
    private String subjectID;
    private String subjectCode;
    private String subjectName;
    private String stream;

    public Subject() 
    {
    }

    public String getSubjectID() {
        return subjectID;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public String getSubjectName() {
        return subjectName;
    }
    
    public String getStream() {
        return stream;
    }

    public Subject (Builder builder)
    {
        this.subjectID = builder.subjectID;
        this.subjectCode = builder.subjectCode;
        this.subjectName = builder.subjectName;
        this.stream = builder.stream;
    }  

    public static class Builder {

        private String subjectID;
        private String subjectCode;
        private String subjectName;
        private String stream;

        public Builder subjectID(String value) {
            this.subjectID = value;
            return this;
        }

        public Builder subjectCode(String value) {
            this.subjectCode = value;
            return this;
        }

        public Builder subjectName(String value) {
            this.subjectName = value;
            return this;
        }
        
        public Builder stream(String value) {
            this.stream = value;
            return this;
        }

        public Subject build() {
            return new Subject(this);
        }
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Subject subject = (Subject) o;

        return subjectID.equals(subject.subjectID);
    }

    @Override
    public int hashCode() {
        return subjectID.hashCode();
    }
}
