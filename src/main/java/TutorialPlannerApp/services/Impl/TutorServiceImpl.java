
package TutorialPlannerApp.services.Impl;

import TutorialPlannerApp.domain.Tutor;
import TutorialPlannerApp.repositories.Impl.TutorRepositoryImpl;
import TutorialPlannerApp.repositories.TutorRepository;
import TutorialPlannerApp.services.TutorService;

public class TutorServiceImpl implements TutorService
{
    private static TutorServiceImpl service = null;
    
    TutorRepository repository = TutorRepositoryImpl.getInstance();
    
    public static TutorServiceImpl getInstance()
    {
        if(service == null)
            service = new TutorServiceImpl();
        
        return service;
            
    }        
    
    public Tutor create(Tutor tutor) {
        return repository.create(tutor);
    }

    public Tutor read(String tutorID) {
        return repository.read(tutorID);
    }

    public Tutor update(Tutor tutor) {
        return repository.update(tutor);
    }

    public void delete(String tutorID) {
        repository.delete(tutorID);

    }
}
