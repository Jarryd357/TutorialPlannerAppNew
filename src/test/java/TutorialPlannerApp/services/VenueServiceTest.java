
package TutorialPlannerApp.services;

import TutorialPlannerApp.domain.Venue;
import TutorialPlannerApp.factories.VenueFactory;
import TutorialPlannerApp.services.Impl.VenueServiceImpl;
import java.util.HashMap;
import java.util.Map;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VenueServiceTest 
{
   VenueService service;
    Map<String,String> values;

    @BeforeMethod
    public void setUp() throws Exception {
        service = new VenueServiceImpl();
        values = new HashMap<String, String>();
        values.put("venueName","Room 1.3");
        values.put("buildingName","Engineering");
    }

    @Test
    public void testCreate() throws Exception {
        Venue venue = VenueFactory.getVenue(values,"001",true);
        service.create(venue);
        assertEquals("Room 1.3",venue.getVenueName());
    }

    @Test(dependsOnMethods = "testCreate")
    public void testRead() throws Exception {
        Venue readvenue = service.read("001");
        assertEquals("Room 1.3",readvenue.getVenueName());
    }

    @Test(dependsOnMethods = "testRead")
    public void testUpdate() throws Exception {
        Venue venue = service.read("001");
        Venue newVenue = new Venue.Builder()
                .venueID("001A")
                .venueName(values.get("venueName"))
                .isLab(true)
                .buildingName(values.get("buildingName"))
                .build();
        service.update(newVenue);
        Venue UpdateVenue = service.read("001A");
        assertEquals("Room 1.3",UpdateVenue.getVenueName());
    }

    @Test(dependsOnMethods = "testUpdate")
    public void testDelete() throws Exception {
        service.delete("001");
        Venue venue = service.read("001");
        assertNull(venue);
    }
}
