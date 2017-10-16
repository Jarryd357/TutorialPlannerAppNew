
package TutorialPlannerApp.factories;

import TutorialPlannerApp.domain.Venue;
import java.util.Map;

public class VenueFactory 
{
     public static Venue getVenue(Map<String, String> values, String venueID, boolean isLab)
     {
        Venue venue = new Venue.Builder()
                .venueID(venueID)
                .venueName(values.get("venueName"))
                .isLab(isLab)
                .buildingName(values.get("buildingName"))
                .build();
        return venue;  
    }
}
