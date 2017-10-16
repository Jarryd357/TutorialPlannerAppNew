
package TutorialPlannerApp.repositories;

import TutorialPlannerApp.domain.Student;
import org.springframework.data.repository.CrudRepository;


public interface StudentRepository extends CrudRepository<Student, Long>
{
    Student create(Student student);

    Student read(String studentID);

    Student update(Student student);

    void delete(String studentID);   
}
