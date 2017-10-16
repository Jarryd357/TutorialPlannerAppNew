
package TutorialPlannerApp.services.Impl;

import TutorialPlannerApp.domain.TutorialType;
import TutorialPlannerApp.repositories.Impl.TutorialTypeRepositoryImpl;
import TutorialPlannerApp.repositories.TutorialTypeRepository;
import TutorialPlannerApp.services.TutorialTypeService;

public class TutorialTypeServiceImpl implements TutorialTypeService
{
    private static TutorialTypeServiceImpl service = null;
    
    TutorialTypeRepository repository = TutorialTypeRepositoryImpl.getInstance();
    
    public static TutorialTypeServiceImpl getInstance()
    {
        if(service == null)
            service = new TutorialTypeServiceImpl();
        
        return service;
            
    }        
    
    public TutorialType create(TutorialType tutorialType) {
        return repository.create(tutorialType);
    }

    public TutorialType read(String tutorialTypeID) {
        return repository.read(tutorialTypeID);
    }

    public TutorialType update(TutorialType tutorialType) {
        return repository.update(tutorialType);
    }

    public void delete(String tutorialTypeID) {
        repository.delete(tutorialTypeID);

    }
}
