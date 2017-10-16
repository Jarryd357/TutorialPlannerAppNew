
package TutorialPlannerApp.services;

import TutorialPlannerApp.domain.TutorialType;
import TutorialPlannerApp.factories.TutorialTypeFactory;
import TutorialPlannerApp.services.Impl.TutorialTypeServiceImpl;
import java.util.HashMap;
import java.util.Map;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TutorialTypeServiceTest 
{
   TutorialTypeService service;
    Map<String,String> values;

    @BeforeMethod
    public void setUp() throws Exception {
        service = new TutorialTypeServiceImpl();
        values = new HashMap<String, String>();
        values.put("tutorialTypeName","Mock Exam");
        values.put("duration","2 hours");
    }

    @Test
    public void testCreate() throws Exception {
        TutorialType tutorialType = TutorialTypeFactory.getTutorialType(values,"001");
        service.create(tutorialType);
        assertEquals("Mock Exam",tutorialType.getTutorialTypeName());
    }

    @Test(dependsOnMethods = "testCreate")
    public void testRead() throws Exception {
        TutorialType readtutorialType = service.read("001");
        assertEquals("Mock Exam",readtutorialType.getTutorialTypeName());
    }

    @Test(dependsOnMethods = "testRead")
    public void testUpdate() throws Exception {
        TutorialType tutorialType = service.read("001");
        TutorialType newTutorialType = new TutorialType.Builder()
                .tutorialTypeID("001A")
                .tutorialTypeName(values.get("tutorialTypeName"))
                .duration(values.get("duration"))
                .build();
        service.update(newTutorialType);
        TutorialType UpdateTutorialType = service.read("001A");
        assertEquals("Mock Exam",UpdateTutorialType.getTutorialTypeName());
    }

    @Test(dependsOnMethods = "testUpdate")
    public void testDelete() throws Exception {
        service.delete("001");
        TutorialType tutorialType = service.read("001");
        assertNull(tutorialType);
    }
}
