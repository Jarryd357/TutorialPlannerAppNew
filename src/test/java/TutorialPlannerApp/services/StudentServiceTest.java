
package TutorialPlannerApp.services;

import TutorialPlannerApp.domain.Student;
import TutorialPlannerApp.factories.StudentFactory;
import TutorialPlannerApp.services.Impl.StudentServiceImpl;
import java.util.HashMap;
import java.util.Map;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class StudentServiceTest 
{
   StudentService service;
    Map<String,String> values;

    @BeforeMethod
    public void setUp() throws Exception {
        service = new StudentServiceImpl();
        values = new HashMap<String, String>();
        values.put("firstName","John");
        values.put("lastName","Wick");
        values.put("studyYear","Third Year");
        values.put("email","killemall@gmail.com");
    }

    @Test
    public void testCreate() throws Exception {
        Student student = StudentFactory.getStudent(values,"001");
        service.create(student);
        assertEquals("Wick",student.getLastName());
    }

    @Test(dependsOnMethods = "testCreate")
    public void testRead() throws Exception {
        Student readstudent = service.read("001");
        assertEquals("Wick",readstudent.getLastName());
    }

    @Test(dependsOnMethods = "testRead")
    public void testUpdate() throws Exception {
        Student student = service.read("001");
        Student newStudent = new Student.Builder()
                .studentID("001A")
                .firstName(values.get("firstName"))
                .lastName(values.get("lastName"))
                .studyYear(values.get("studyYear"))
                .email(values.get("email"))
                .build();
        service.update(newStudent);
        Student UpdateStudent = service.read("001A");
        assertEquals("Wick",UpdateStudent.getLastName());
    }

    @Test(dependsOnMethods = "testUpdate")
    public void testDelete() throws Exception {
        service.delete("001");
        Student student = service.read("001");
        assertNull(student);
    }
}
