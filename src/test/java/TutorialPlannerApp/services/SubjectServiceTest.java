
package TutorialPlannerApp.services;

import TutorialPlannerApp.domain.Subject;
import TutorialPlannerApp.factories.SubjectFactory;
import TutorialPlannerApp.services.Impl.SubjectServiceImpl;
import java.util.HashMap;
import java.util.Map;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SubjectServiceTest 
{
   SubjectService service;
    Map<String,String> values;

    @BeforeMethod
    public void setUp() throws Exception {
        service = new SubjectServiceImpl();
        values = new HashMap<String, String>();
        values.put("subjectCode","TPG200S");
        values.put("subjectName","Technical Programming 2");
        values.put("stream","Software Development");
    }

    @Test
    public void testCreate() throws Exception {
        Subject subject = SubjectFactory.getSubject(values,"001");
        service.create(subject);
        assertEquals("TPG200S",subject.getSubjectCode());
    }

    @Test(dependsOnMethods = "testCreate")
    public void testRead() throws Exception {
        Subject readsubject = service.read("001");
        assertEquals("TPG200S",readsubject.getSubjectCode());
    }

    @Test(dependsOnMethods = "testRead")
    public void testUpdate() throws Exception {
        Subject subject = service.read("001");
        Subject newSubject = new Subject.Builder()
                .subjectID("001A")
                .subjectCode(values.get("subjectCode"))
                .subjectName(values.get("subjectName"))
                .stream(values.get("stream"))
                .build();
        service.update(newSubject);
        Subject UpdateSubject = service.read("001A");
        assertEquals("TPG200S",UpdateSubject.getSubjectCode());
    }

    @Test(dependsOnMethods = "testUpdate")
    public void testDelete() throws Exception {
        service.delete("001");
        Subject subject = service.read("001");
        assertNull(subject);
    }
}
