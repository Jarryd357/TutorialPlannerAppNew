
package TutorialPlannerApp.services.Impl;

import TutorialPlannerApp.domain.Subject;
import TutorialPlannerApp.repositories.Impl.SubjectRepositoryImpl;
import TutorialPlannerApp.repositories.SubjectRepository;
import TutorialPlannerApp.services.SubjectService;

public class SubjectServiceImpl implements SubjectService
{
    private static SubjectServiceImpl service = null;
    
    SubjectRepository repository = SubjectRepositoryImpl.getInstance();
    
    public static SubjectServiceImpl getInstance()
    {
        if(service == null)
            service = new SubjectServiceImpl();
        
        return service;
            
    }        
    
    public Subject create(Subject subject) {
        return repository.create(subject);
    }

    public Subject read(String subjectID) {
        return repository.read(subjectID);
    }

    public Subject update(Subject subject) {
        return repository.update(subject);
    }

    public void delete(String subjectID) {
        repository.delete(subjectID);

    }
}
