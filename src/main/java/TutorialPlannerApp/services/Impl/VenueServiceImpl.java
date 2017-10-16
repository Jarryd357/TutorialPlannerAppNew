
package TutorialPlannerApp.services.Impl;

import TutorialPlannerApp.domain.Venue;
import TutorialPlannerApp.repositories.Impl.VenueRepositoryImpl;
import TutorialPlannerApp.repositories.VenueRepository;
import TutorialPlannerApp.services.VenueService;

public class VenueServiceImpl implements VenueService
{
    private static VenueServiceImpl service = null;
    
    VenueRepository repository = VenueRepositoryImpl.getInstance();
    
    public static VenueServiceImpl getInstance()
    {
        if(service == null)
            service = new VenueServiceImpl();
        
        return service;
            
    }        
    
    public Venue create(Venue venue) {
        return repository.create(venue);
    }

    public Venue read(String venueID) {
        return repository.read(venueID);
    }

    public Venue update(Venue venue) {
        return repository.update(venue);
    }

    public void delete(String venueID) {
        repository.delete(venueID);

    }
}
