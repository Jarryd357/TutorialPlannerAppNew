/*
Name: Jarryd Pretorius
Tutor No: 206155247
*/

package TutorialPlannerApp.domain;

public class Tutor 
{
    private String tutorID;
    private String firstName;
    private String lastName;
    private String occupation;
    private String email;

    public Tutor() 
    {
    }

    public String getTutorID() {
        return tutorID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    
    public String getOccupation() {
        return occupation;
    }
    
    public String getEmail() {
        return email;
    }

    public Tutor (Builder builder)
    {
        this.tutorID = builder.tutorID;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.occupation = builder.occupation;
        this.email = builder.email;
    }  

    public static class Builder {

        private String tutorID;
        private String firstName;
        private String lastName;
        private String occupation;
        private String email;

        public Builder tutorID(String value) {
            this.tutorID = value;
            return this;
        }

        public Builder firstName(String value) {
            this.firstName = value;
            return this;
        }

        public Builder lastName(String value) {
            this.lastName = value;
            return this;
        }
        
        public Builder occupation(String value) {
            this.occupation = value;
            return this;
        }
        
        public Builder email(String value) {
            this.email = value;
            return this;
        }

        public Tutor build() {
            return new Tutor(this);
        }
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tutor tutor = (Tutor) o;

        return tutorID.equals(tutor.tutorID);
    }

    @Override
    public int hashCode() {
        return tutorID.hashCode();
    }
}
