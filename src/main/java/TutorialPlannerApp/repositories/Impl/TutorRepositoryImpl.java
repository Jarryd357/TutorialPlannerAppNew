
package TutorialPlannerApp.repositories.Impl;

import TutorialPlannerApp.domain.Tutor;
import TutorialPlannerApp.repositories.TutorRepository;
import java.util.HashMap;
import java.util.Map;

public class TutorRepositoryImpl implements TutorRepository
{
    private static TutorRepositoryImpl respository = null;

    private Map<String,Tutor> tutorTable;

    private TutorRepositoryImpl() {
        tutorTable = new HashMap<String, Tutor>();
    }

    public static TutorRepositoryImpl getInstance(){
        if(respository==null)
            respository = new TutorRepositoryImpl();
        return respository;
    }

    public Tutor create(Tutor tutor) {
        tutorTable.put(tutor.getTutorID(),tutor);
        Tutor savedTutor = tutorTable.get(tutor.getTutorID());
        return savedTutor;
    }

    public Tutor read(String tutorID) {
        Tutor tutor = tutorTable.get(tutorID);
        return tutor;
    }

    public Tutor update(Tutor tutor) {
        tutorTable.put(tutor.getTutorID(),tutor);
        Tutor savedTutor = tutorTable.get(tutor.getTutorID());
        return savedTutor;
    }

    public void delete(String tutorID) {
        tutorTable.remove(tutorID);

    }
}
