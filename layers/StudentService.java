package layers;

import java.util.List;

public class StudentService {
    StudentRepository repo;
    public StudentService(StudentRepository repo){
        this.repo = repo;
    }
    //business logic= i wanna add studemt data
    public void add(Student student){
        //i wanna call the similiar function that already exists in repo
        //=>create object of repo and call that directly
        //dependency injection
        repo.save(student);
    }
    //similarly:
    public List<Student> getAllStudents(){
        return repo.findAll();
    }
    public Student getStudentByID(int id){
        return repo.findByID(id);
    }
    public void update(int id, String name, int newid, String course){
        repo.updateByID(id, name, newid, course);
    }
    public void delete(int id){
        repo.deleteByID(id);
    }
}
