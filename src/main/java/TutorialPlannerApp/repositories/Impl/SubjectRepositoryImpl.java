
package TutorialPlannerApp.repositories.Impl;

import TutorialPlannerApp.domain.Subject;
import TutorialPlannerApp.repositories.SubjectRepository;
import java.util.HashMap;
import java.util.Map;

public class SubjectRepositoryImpl implements SubjectRepository
{
    private static SubjectRepositoryImpl respository = null;

    private Map<String,Subject> subjectTable;

    private SubjectRepositoryImpl() {
        subjectTable = new HashMap<String, Subject>();
    }

    public static SubjectRepositoryImpl getInstance(){
        if(respository==null)
            respository = new SubjectRepositoryImpl();
        return respository;
    }

    public Subject create(Subject subject) {
        subjectTable.put(subject.getSubjectID(),subject);
        Subject savedSubject = subjectTable.get(subject.getSubjectID());
        return savedSubject;
    }

    public Subject read(String subjectID) {
        Subject subject = subjectTable.get(subjectID);
        return subject;
    }

    public Subject update(Subject subject) {
        subjectTable.put(subject.getSubjectID(),subject);
        Subject savedSubject = subjectTable.get(subject.getSubjectID());
        return savedSubject;
    }

    public void delete(String subjectID) {
        subjectTable.remove(subjectID);

    }
}
