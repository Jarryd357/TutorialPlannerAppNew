
package TutorialPlannerApp.repositories.Impl;

import TutorialPlannerApp.domain.Student;
import TutorialPlannerApp.repositories.StudentRepository;
import java.util.HashMap;
import java.util.Map;

public class StudentRepositoryImpl implements StudentRepository
{
    private static StudentRepositoryImpl respository = null;

    private Map<String,Student> studentTable;

    private StudentRepositoryImpl() {
        studentTable = new HashMap<String, Student>();
    }

    public static StudentRepositoryImpl getInstance(){
        if(respository==null)
            respository = new StudentRepositoryImpl();
        return respository;
    }

    public Student create(Student student) {
        studentTable.put(student.getStudentID(),student);
        Student savedStudent = studentTable.get(student.getStudentID());
        return savedStudent;
    }

    public Student read(String studentID) {
        Student student = studentTable.get(studentID);
        return student;
    }

    public Student update(Student student) {
        studentTable.put(student.getStudentID(),student);
        Student savedStudent = studentTable.get(student.getStudentID());
        return savedStudent;
    }

    public void delete(String studentID) {
        studentTable.remove(studentID);

    }

    @Override
    public <S extends Student> S save(S s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public <S extends Student> Iterable<S> save(Iterable<S> itrbl) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Student findOne(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean exists(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Iterable<Student> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Iterable<Student> findAll(Iterable<Long> itrbl) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long count() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Student t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Iterable<? extends Student> itrbl) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
