
package TutorialPlannerApp.repositories;

import TutorialPlannerApp.domain.Tutor;

public interface TutorRepository 
{
    Tutor create(Tutor tutor);

    Tutor read(String tutorID);

    Tutor update(Tutor tutor);

    void delete(String tutorID);   
}
