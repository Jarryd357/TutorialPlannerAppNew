
package TutorialPlannerApp.repositories;

import TutorialPlannerApp.domain.Venue;

public interface VenueRepository 
{
    Venue create(Venue venue);

    Venue read(String venueID);

    Venue update(Venue venue);

    void delete(String venueID);   
}
