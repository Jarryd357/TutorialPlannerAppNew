
package TutorialPlannerApp.factories;

import TutorialPlannerApp.domain.Venue;
import java.util.HashMap;
import java.util.Map;
import static org.testng.Assert.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VenueFactoryTest 
{
   Map<String,String> values;

    @BeforeMethod
    public void setUp() throws Exception {
        values = new HashMap<String, String>();
        //values.put("venueID","001");
        values.put("venueName","Room 1.3");
        values.put("buildingName","Engineering");
    }

    @Test
    public void getVenue() throws Exception {
        Venue venue = VenueFactory.getVenue(values, "001", true);
        assertEquals("Room 1.3",venue.getVenueName());
    }

}
