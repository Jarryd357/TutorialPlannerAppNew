
package TutorialPlannerApp.services;

import TutorialPlannerApp.domain.Subject;

public interface SubjectService 
{
    Subject create(Subject subject);
    Subject read(String subjectID);
    Subject update(Subject subject);
    void delete (String subjectID);
}
