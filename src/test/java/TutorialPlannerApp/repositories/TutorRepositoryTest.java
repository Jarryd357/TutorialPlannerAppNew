
package TutorialPlannerApp.repositories;

import TutorialPlannerApp.domain.Tutor;
import TutorialPlannerApp.factories.TutorFactory;
import TutorialPlannerApp.repositories.Impl.TutorRepositoryImpl;
import java.util.HashMap;
import java.util.Map;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TutorRepositoryTest 
{
    Map<String,String> values;
    TutorRepository repository;

    @BeforeMethod
    public void setUp() throws Exception {
        repository = TutorRepositoryImpl.getInstance();
        values = new HashMap<String, String>();
        values.put("firstName","Boniface");
        values.put("lastName","Kabaso");
        values.put("occupation","Lecturer");
        values.put("email","bonifacekabaso@gmail.com");
    }

    @Test
    public void create() throws Exception {
        Tutor tutor = TutorFactory.getTutor(values,"001");
        repository.create(tutor);
        assertEquals("Kabaso",tutor.getLastName());
    }

    @Test(dependsOnMethods = "create")
    public void read() throws Exception {
        Tutor readtutor = repository.read("001");
        assertEquals("Kabaso",readtutor.getLastName());
    }

    @Test(dependsOnMethods = "read")
    public void update() throws Exception {
        Tutor tutor = repository.read("001");
        Tutor newTutor = new Tutor.Builder()
                .tutorID("001A")
                .firstName(values.get("firstName"))
                .lastName(values.get("lastName"))
                .occupation(values.get("occupation"))
                .email(values.get("email"))
                .build();
        repository.update(newTutor);
        Tutor UpdateTutor = repository.read("001A");
        assertEquals("Kabaso",UpdateTutor.getLastName());
    }

    @Test (dependsOnMethods = "update")
    public void delete() throws Exception {
        repository.delete("001");
        Tutor tutor = repository.read("001");
        assertNull(tutor);
    }
}
