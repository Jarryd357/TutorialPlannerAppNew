/*
Name: Jarryd Pretorius
Student No: 206155247
*/

package TutorialPlannerApp.domain;

public class Venue 
{
    private String venueID;
    private String venueName;
    private boolean isLab;
    private String buildingName;

    public Venue() 
    {
    }

    public String getVenueID() {
        return venueID;
    }

    public String getVenueName() {
        return venueName;
    }

    public boolean getIsLab() {
        return isLab;
    }
    
    public String getBuildingName() {
        return buildingName;
    }

    public Venue (Builder builder)
    {
        this.venueID = builder.venueID;
        this.venueName = builder.venueName;
        this.isLab = builder.isLab;
        this.buildingName = builder.buildingName;
    }  

    public static class Builder {

        private String venueID;
        private String venueName;
        private boolean isLab;
        private String buildingName;

        public Builder venueID(String value) {
            this.venueID = value;
            return this;
        }

        public Builder venueName(String value) {
            this.venueName = value;
            return this;
        }

        public Builder isLab(boolean value) {
            this.isLab = value;
            return this;
        }
        
        public Builder buildingName(String value) {
            this.buildingName = value;
            return this;
        }

        public Venue build() {
            return new Venue(this);
        }
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Venue venue = (Venue) o;

        return venueID.equals(venue.venueID);
    }

    @Override
    public int hashCode() {
        return venueID.hashCode();
    }
}
