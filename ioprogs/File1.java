package ioprogs;
import java.io.File;

public class File1 {
    public static void main(String[] args) {
        File f1 = new File("data.txt");
        try{
            f1.createNewFile();
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println(f1.isFile());
        System.out.println(f1.canRead());
        System.out.println(f1.canWrite());
        f1.delete();
        System.out.println(f1.length());
    }
}
