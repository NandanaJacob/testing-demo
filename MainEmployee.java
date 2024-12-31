import java.util.Scanner;
public class MainEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee(100, "nandana" , 200000);
        System.out.println(e1.getId());
        System.out.println(e1.getName());
        System.out.println(e1.getSal());
        //System.out.println(e1);

        //read data frm user at runtime, use Scanner from java.util
        //=> import java.util.Scanner
    }
}
