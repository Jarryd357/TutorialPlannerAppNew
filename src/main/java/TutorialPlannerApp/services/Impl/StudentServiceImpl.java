
package TutorialPlannerApp.services.Impl;

import TutorialPlannerApp.domain.Student;
import TutorialPlannerApp.repositories.Impl.StudentRepositoryImpl;
import TutorialPlannerApp.repositories.StudentRepository;
import TutorialPlannerApp.services.StudentService;

public class StudentServiceImpl implements StudentService
{
    private static StudentServiceImpl service = null;
    
    StudentRepository repository = StudentRepositoryImpl.getInstance();
    
    public static StudentServiceImpl getInstance()
    {
        if(service == null)
            service = new StudentServiceImpl();
        
        return service;
            
    }        
    
    public Student create(Student student) {
        return repository.create(student);
    }

    public Student read(String studentID) {
        return repository.read(studentID);
    }

    public Student update(Student student) {
        return repository.update(student);
    }

    public void delete(String studentID) {
        repository.delete(studentID);

    }
}
