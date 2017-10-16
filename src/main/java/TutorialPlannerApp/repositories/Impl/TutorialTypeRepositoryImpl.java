
package TutorialPlannerApp.repositories.Impl;

import TutorialPlannerApp.domain.TutorialType;
import TutorialPlannerApp.repositories.TutorialTypeRepository;
import java.util.HashMap;
import java.util.Map;

public class TutorialTypeRepositoryImpl implements TutorialTypeRepository
{
    private static TutorialTypeRepositoryImpl respository = null;

    private Map<String,TutorialType> tutorialTypeTable;

    private TutorialTypeRepositoryImpl() {
        tutorialTypeTable = new HashMap<String, TutorialType>();
    }

    public static TutorialTypeRepositoryImpl getInstance(){
        if(respository==null)
            respository = new TutorialTypeRepositoryImpl();
        return respository;
    }

    public TutorialType create(TutorialType tutorialType) {
        tutorialTypeTable.put(tutorialType.getTutorialTypeID(),tutorialType);
        TutorialType savedTutorialType = tutorialTypeTable.get(tutorialType.getTutorialTypeID());
        return savedTutorialType;
    }

    public TutorialType read(String tutorialTypeID) {
        TutorialType tutorialType = tutorialTypeTable.get(tutorialTypeID);
        return tutorialType;
    }

    public TutorialType update(TutorialType tutorialType) {
        tutorialTypeTable.put(tutorialType.getTutorialTypeID(),tutorialType);
        TutorialType savedTutorialType = tutorialTypeTable.get(tutorialType.getTutorialTypeID());
        return savedTutorialType;
    }

    public void delete(String tutorialTypeID) {
        tutorialTypeTable.remove(tutorialTypeID);

    }
}
