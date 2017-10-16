
package TutorialPlannerApp.repositories;

import TutorialPlannerApp.domain.TutorialType;
import TutorialPlannerApp.factories.TutorialTypeFactory;
import TutorialPlannerApp.repositories.Impl.TutorialTypeRepositoryImpl;
import java.util.HashMap;
import java.util.Map;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TutorialTypeRepositoryTest 
{
    Map<String,String> values;
    TutorialTypeRepository repository;

    @BeforeMethod
    public void setUp() throws Exception {
        repository = TutorialTypeRepositoryImpl.getInstance();
        values = new HashMap<String, String>();
        values.put("tutorialTypeName","Mock Exam");
        values.put("duration","2 hours");
    }

    @Test
    public void create() throws Exception {
        TutorialType tutorialType = TutorialTypeFactory.getTutorialType(values,"001");
        repository.create(tutorialType);
        assertEquals("Mock Exam",tutorialType.getTutorialTypeName());
    }

    @Test(dependsOnMethods = "create")
    public void read() throws Exception {
        TutorialType readtutorialType = repository.read("001");
        assertEquals("Mock Exam",readtutorialType.getTutorialTypeName());
    }

    @Test(dependsOnMethods = "read")
    public void update() throws Exception {
        TutorialType tutorialType = repository.read("001");
        TutorialType newTutorialType = new TutorialType.Builder()
                .tutorialTypeID("001A")
                .tutorialTypeName(values.get("tutorialTypeName"))
                .duration(values.get("duration"))
                .build();
        repository.update(newTutorialType);
        TutorialType UpdateTutorialType = repository.read("001A");
        assertEquals("Mock Exam",UpdateTutorialType.getTutorialTypeName());
    }

    @Test (dependsOnMethods = "update")
    public void delete() throws Exception {
        repository.delete("001");
        TutorialType tutorialType = repository.read("001");
        assertNull(tutorialType);
    }
}
