
package TutorialPlannerApp.services;

import TutorialPlannerApp.domain.Tutor;

public interface TutorService 
{
    Tutor create(Tutor tutor);
    Tutor read(String tutorID);
    Tutor update(Tutor tutor);
    void delete (String tutorID);
}
