
package TutorialPlannerApp.services;

import TutorialPlannerApp.domain.Tutor;
import TutorialPlannerApp.factories.TutorFactory;
import TutorialPlannerApp.services.Impl.TutorServiceImpl;
import java.util.HashMap;
import java.util.Map;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TutorServiceTest 
{
   TutorService service;
    Map<String,String> values;

    @BeforeMethod
    public void setUp() throws Exception {
        service = new TutorServiceImpl();
        values = new HashMap<String, String>();
        values = new HashMap<String, String>();
        values.put("firstName","Boniface");
        values.put("lastName","Kabaso");
        values.put("occupation","Lecturer");
        values.put("email","bonifacekabaso@gmail.com");
    }

    @Test
    public void testCreate() throws Exception {
        Tutor tutor = TutorFactory.getTutor(values,"001");
        service.create(tutor);
        assertEquals("Kabaso",tutor.getLastName());
    }

    @Test(dependsOnMethods = "testCreate")
    public void testRead() throws Exception {
        Tutor readtutor = service.read("001");
        assertEquals("Kabaso",readtutor.getLastName());
    }

    @Test(dependsOnMethods = "testRead")
    public void testUpdate() throws Exception {
        Tutor tutor = service.read("001");
        Tutor newTutor = new Tutor.Builder()
                .tutorID("001A")
                .firstName(values.get("firstName"))
                .lastName(values.get("lastName"))
                .occupation(values.get("occupation"))
                .email(values.get("email"))
                .build();
        service.update(newTutor);
        Tutor UpdateTutor = service.read("001A");
        assertEquals("Kabaso",UpdateTutor.getLastName());
    }

    @Test(dependsOnMethods = "testUpdate")
    public void testDelete() throws Exception {
        service.delete("001");
        Tutor tutor = service.read("001");
        assertNull(tutor);
    }
}
