
package TutorialPlannerApp.repositories;

import TutorialPlannerApp.domain.Subject;

public interface SubjectRepository 
{
    Subject create(Subject subject);

    Subject read(String subjectID);

    Subject update(Subject subject);

    void delete(String subjectID);   
}
