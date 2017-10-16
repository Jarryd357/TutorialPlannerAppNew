
package TutorialPlannerApp.factories;

import TutorialPlannerApp.domain.Student;
import java.util.HashMap;
import java.util.Map;
import static org.testng.Assert.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class StudentFactoryTest 
{
   Map<String,String> values;

    @BeforeMethod
    public void setUp() throws Exception {
        values = new HashMap<String, String>();
        //values.put("studentID","001");
        values.put("firstName","John");
        values.put("lastName","Wick");
        values.put("studyYear","Third Year");
        values.put("email","killemall@gmail.com");
    }

    @Test
    public void getStudent() throws Exception {
        Student student = StudentFactory.getStudent(values, "001");
        assertEquals("Wick",student.getLastName());
    }

}
