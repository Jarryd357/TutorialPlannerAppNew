
package TutorialPlannerApp.factories;

import TutorialPlannerApp.domain.Subject;
import java.util.Map;

public class SubjectFactory 
{
     public static Subject getSubject(Map<String, String> values, String subjectID)
     {
        Subject subject = new Subject.Builder()
                .subjectID(subjectID)
                .subjectCode(values.get("subjectCode"))
                .subjectName(values.get("subjectName"))
                .stream(values.get("stream"))
                .build();
        return subject;  
    }
}
