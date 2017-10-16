
package TutorialPlannerApp.services;

import TutorialPlannerApp.domain.Student;

public interface StudentService 
{
    Student create(Student student);
    Student read(String studentID);
    Student update(Student student);
    void delete (String studentID);
}
