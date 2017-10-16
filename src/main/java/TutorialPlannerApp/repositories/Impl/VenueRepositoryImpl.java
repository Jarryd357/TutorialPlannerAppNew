
package TutorialPlannerApp.repositories.Impl;

import TutorialPlannerApp.domain.Venue;
import TutorialPlannerApp.repositories.VenueRepository;
import java.util.HashMap;
import java.util.Map;

public class VenueRepositoryImpl implements VenueRepository
{
    private static VenueRepositoryImpl respository = null;

    private Map<String,Venue> venueTable;

    private VenueRepositoryImpl() {
        venueTable = new HashMap<String, Venue>();
    }

    public static VenueRepositoryImpl getInstance(){
        if(respository==null)
            respository = new VenueRepositoryImpl();
        return respository;
    }

    public Venue create(Venue venue) {
        venueTable.put(venue.getVenueID(),venue);
        Venue savedVenue = venueTable.get(venue.getVenueID());
        return savedVenue;
    }

    public Venue read(String venueID) {
        Venue venue = venueTable.get(venueID);
        return venue;
    }

    public Venue update(Venue venue) {
        venueTable.put(venue.getVenueID(),venue);
        Venue savedVenue = venueTable.get(venue.getVenueID());
        return savedVenue;
    }

    public void delete(String venueID) {
        venueTable.remove(venueID);

    }
}
