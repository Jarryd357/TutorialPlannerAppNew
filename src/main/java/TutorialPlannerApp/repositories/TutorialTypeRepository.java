
package TutorialPlannerApp.repositories;

import TutorialPlannerApp.domain.TutorialType;

public interface TutorialTypeRepository 
{
    TutorialType create(TutorialType tutorialType);

    TutorialType read(String tutorialTypeID);

    TutorialType update(TutorialType tutorialType);

    void delete(String tutorialTypeID);   
}
