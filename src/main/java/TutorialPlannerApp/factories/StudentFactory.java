
package TutorialPlannerApp.factories;

import TutorialPlannerApp.domain.Student;
import java.util.Map;

public class StudentFactory 
{
     public static Student getStudent(Map<String, String> values, String studentID)
     {
        Student student = new Student.Builder()
                .studentID(studentID)
                .firstName(values.get("firstName"))
                .lastName(values.get("lastName"))
                .studyYear(values.get("studyYear"))
                .email(values.get("email"))
                .build();
        return student;  
    }
}
