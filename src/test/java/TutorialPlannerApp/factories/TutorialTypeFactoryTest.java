
package TutorialPlannerApp.factories;

import TutorialPlannerApp.domain.TutorialType;
import java.util.HashMap;
import java.util.Map;
import static org.testng.Assert.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TutorialTypeFactoryTest 
{
   Map<String,String> values;

    @BeforeMethod
    public void setUp() throws Exception {
        values = new HashMap<String, String>();
        //values.put("tutorialTypeID","001");
        values.put("tutorialTypeName","Mock Exam");
        values.put("duration","2 hours");
    }

    @Test
    public void getTutorialType() throws Exception {
        TutorialType tutorialType = TutorialTypeFactory.getTutorialType(values, "001");
        assertEquals("Mock Exam",tutorialType.getTutorialTypeName());
    }

}
