
package TutorialPlannerApp.repositories;

import TutorialPlannerApp.domain.Student;
import TutorialPlannerApp.factories.StudentFactory;
import TutorialPlannerApp.repositories.Impl.StudentRepositoryImpl;
import java.util.HashMap;
import java.util.Map;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class StudentRepositoryTest 
{
    Map<String,String> values;
    StudentRepository repository;

    @BeforeMethod
    public void setUp() throws Exception {
        repository = StudentRepositoryImpl.getInstance();
        values = new HashMap<String, String>();
        values.put("firstName","John");
        values.put("lastName","Wick");
        values.put("studyYear","Third Year");
        values.put("email","killemall@gmail.com");
    }

    @Test
    public void create() throws Exception {
        Student student = StudentFactory.getStudent(values,"001");
        repository.create(student);
        assertEquals("Wick",student.getLastName());
    }

    @Test(dependsOnMethods = "create")
    public void read() throws Exception {
        Student readstudent = repository.read("001");
        assertEquals("Wick",readstudent.getLastName());
    }

    @Test(dependsOnMethods = "read")
    public void update() throws Exception {
        Student student = repository.read("001");
        Student newStudent = new Student.Builder()
                .studentID("001A")
                .firstName(values.get("firstName"))
                .lastName(values.get("lastName"))
                .studyYear(values.get("studyYear"))
                .email(values.get("email"))
                .build();
        repository.update(newStudent);
        Student UpdateStudent = repository.read("001A");
        assertEquals("Wick",UpdateStudent.getLastName());
    }

    @Test (dependsOnMethods = "update")
    public void delete() throws Exception {
        repository.delete("001");
        Student student = repository.read("001");
        assertNull(student);
    }
}
