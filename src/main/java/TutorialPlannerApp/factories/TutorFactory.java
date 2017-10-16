
package TutorialPlannerApp.factories;

import TutorialPlannerApp.domain.Tutor;
import java.util.Map;

public class TutorFactory 
{
     public static Tutor getTutor(Map<String, String> values, String tutorID)
     {
        Tutor tutor = new Tutor.Builder()
                .tutorID(tutorID)
                .firstName(values.get("firstName"))
                .lastName(values.get("lastName"))
                .occupation(values.get("occupation"))
                .email(values.get("email"))
                .build();
        return tutor;  
    }
}
