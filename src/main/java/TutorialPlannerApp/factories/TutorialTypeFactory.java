
package TutorialPlannerApp.factories;

import TutorialPlannerApp.domain.TutorialType;
import java.util.Map;

public class TutorialTypeFactory 
{
     public static TutorialType getTutorialType(Map<String, String> values, String tutorialTypeID)
     {
        TutorialType tutorialType = new TutorialType.Builder()
                .tutorialTypeID(tutorialTypeID)
                .tutorialTypeName(values.get("tutorialTypeName"))
                .duration(values.get("duration"))
                .build();
        return tutorialType;  
    }
}
