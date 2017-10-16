
package TutorialPlannerApp.factories;

import TutorialPlannerApp.domain.Tutor;
import java.util.HashMap;
import java.util.Map;
import static org.testng.Assert.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TutorFactoryTest 
{
   Map<String,String> values;

    @BeforeMethod
    public void setUp() throws Exception {
        values = new HashMap<String, String>();
        //values.put("tutorID","001");
        values.put("firstName","Boniface");
        values.put("lastName","Kabaso");
        values.put("occupation","Lecturer");
        values.put("email","bonifacekabaso@gmail.com");
    }

    @Test
    public void getTutor() throws Exception {
        Tutor tutor = TutorFactory.getTutor(values, "001");
        assertEquals("Kabaso",tutor.getLastName());
    }

}
