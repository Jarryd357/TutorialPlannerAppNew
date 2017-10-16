
package TutorialPlannerApp.services;

import TutorialPlannerApp.domain.TutorialType;

public interface TutorialTypeService 
{
    TutorialType create(TutorialType tutorialType);
    TutorialType read(String tutorialTypeID);
    TutorialType update(TutorialType tutorialType);
    void delete (String tutorialTypeID);
}
