
package TutorialPlannerApp.repositories;

import TutorialPlannerApp.domain.Subject;
import TutorialPlannerApp.factories.SubjectFactory;
import TutorialPlannerApp.repositories.Impl.SubjectRepositoryImpl;
import java.util.HashMap;
import java.util.Map;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SubjectRepositoryTest 
{
    Map<String,String> values;
    SubjectRepository repository;

    @BeforeMethod
    public void setUp() throws Exception {
        repository = SubjectRepositoryImpl.getInstance();
        values = new HashMap<String, String>();
        values.put("subjectCode","TPG200S");
        values.put("subjectName","Technical Programming 2");
        values.put("stream","Software Development");
    }

    @Test
    public void create() throws Exception {
        Subject subject = SubjectFactory.getSubject(values,"001");
        repository.create(subject);
        assertEquals("TPG200S",subject.getSubjectCode());
    }

    @Test(dependsOnMethods = "create")
    public void read() throws Exception {
        Subject readsubject = repository.read("001");
        assertEquals("TPG200S",readsubject.getSubjectCode());
    }

    @Test(dependsOnMethods = "read")
    public void update() throws Exception {
        Subject subject = repository.read("001");
        Subject newSubject = new Subject.Builder()
                .subjectID("001A")
                .subjectCode(values.get("subjectCode"))
                .subjectName(values.get("subjectName"))
                .stream(values.get("stream"))
                .build();
        repository.update(newSubject);
        Subject UpdateSubject = repository.read("001A");
        assertEquals("TPG200S",UpdateSubject.getSubjectCode());
    }

    @Test (dependsOnMethods = "update")
    public void delete() throws Exception {
        repository.delete("001");
        Subject subject = repository.read("001");
        assertNull(subject);
    }
}
