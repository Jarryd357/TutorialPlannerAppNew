
package TutorialPlannerApp.repositories;

import TutorialPlannerApp.domain.Venue;
import TutorialPlannerApp.factories.VenueFactory;
import TutorialPlannerApp.repositories.Impl.VenueRepositoryImpl;
import java.util.HashMap;
import java.util.Map;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VenueRepositoryTest 
{
    Map<String,String> values;
    VenueRepository repository;

    @BeforeMethod
    public void setUp() throws Exception {
        repository = VenueRepositoryImpl.getInstance();
        values = new HashMap<String, String>();
        values.put("venueName","Room 1.3");
        values.put("buildingName","Engineering");
    }

    @Test
    public void create() throws Exception {
        Venue venue = VenueFactory.getVenue(values,"001",true);
        repository.create(venue);
        assertEquals("Room 1.3",venue.getVenueName());
    }

    @Test(dependsOnMethods = "create")
    public void read() throws Exception {
        Venue readvenue = repository.read("001");
        assertEquals("Room 1.3",readvenue.getVenueName());
    }

    @Test(dependsOnMethods = "read")
    public void update() throws Exception {
        Venue venue = repository.read("001");
        Venue newVenue = new Venue.Builder()
                .venueID("001A")
                .venueName(values.get("venueName"))
                .isLab(true)
                .buildingName(values.get("buildingName"))
                .build();
        repository.update(newVenue);
        Venue UpdateVenue = repository.read("001A");
        assertEquals("Room 1.3",UpdateVenue.getVenueName());
    }

    @Test (dependsOnMethods = "update")
    public void delete() throws Exception {
        repository.delete("001");
        Venue venue = repository.read("001");
        assertNull(venue);
    }
}
