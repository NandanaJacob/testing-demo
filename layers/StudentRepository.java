package layers;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    private List<Student> students= new ArrayList<Student>();
//some functions to do stuff in the repo

    //function to add 
    public void save(Student student){
        students.add(student);
        System.out.println("Student added: " + students);
    }
    //function to findAll students info
    public List<Student> findAll(){
        return students;
    }
    //find student based on id
    public Student findByID(int id){
        return students.stream().filter(st -> st.getId()==id).findFirst().orElse(null);
    }
    //function to updateid
    public void updateByID(int id, String name, int newid, String course){
        System.out.println("student of id " + id + " is updated. ");
        Student student = students.stream().filter(st -> st.getId()==id).findFirst().orElse(null);
        if(student==null){
            System.out.println("no student by that id");
            return;
        }
        // student.id = newid;
        // student.name = name;
        // student.course = course;
        student.setId(newid);
        student.setName(name);
        student.setCourse(course);
    }
    //maam suggested this is better for update():
    public void updateByID_object(int id, Student std){
        System.out.println("student of id " + id + " is updated. ");
        Student student = students.stream().filter(st -> st.getId()==id).findFirst().orElse(null);
        if(student==null){
            System.out.println("no student by that id");
            return;
        }
        student.setId(std.id);
        student.setName(std.name);
        student.setCourse(std.course);
    }
    //function to delete
    public void deleteByID(int id){
        System.out.println("student of id " + id + " is deleted. ");
        Student student = students.stream().filter(st -> st.getId()==id).findFirst().orElse(null);
        if(student==null){
            System.out.println("no student by that id");
            return;
        }
        students.remove(student);
    }
}
