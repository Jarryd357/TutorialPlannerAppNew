
package TutorialPlannerApp.services;

import TutorialPlannerApp.domain.Venue;

public interface VenueService 
{
    Venue create(Venue venue);
    Venue read(String venueID);
    Venue update(Venue venue);
    void delete (String venueID);
}
