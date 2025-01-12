package ioprogs;
import java.io.*;
public class SerializeDemo {
    public static void main(String[] args) {
        try{
            Student st = new Student(100, "cittu", 89);
            FileOutputStream fos = new FileOutputStream("serialize.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(st);
            oos.close();
        }catch(IOException e){
            System.out.println(e);
        }
        //serialized info is stored in serialize.txt in a way we cant understand
        //to deserialize 
        try{
            Student stu;
            FileInputStream fis = new FileInputStream("serialize.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            stu = (Student)ois.readObject();
            ois.close();
            System.out.println(stu);
        }catch(ClassNotFoundException | IOException e){
            System.out.println(e);
        }
    }
}

/*
 * if u wanna avoid certain st members from beinig serialized, use transient in Student class
 */