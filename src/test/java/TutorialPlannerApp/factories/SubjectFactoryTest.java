
package TutorialPlannerApp.factories;

import TutorialPlannerApp.domain.Subject;
import java.util.HashMap;
import java.util.Map;
import static org.testng.Assert.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SubjectFactoryTest 
{
   Map<String,String> values;

    @BeforeMethod
    public void setUp() throws Exception {
        values = new HashMap<String, String>();
        //values.put("subjectID","001");
        values.put("subjectCode","TPG200S");
        values.put("subjectName","Technical Programming 2");
        values.put("stream","Software Development");
    }

    @Test
    public void getSubject() throws Exception {
        Subject subject = SubjectFactory.getSubject(values, "001");
        assertEquals("TPG200S",subject.getSubjectCode());
    }

}
