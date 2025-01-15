package collectionprog;
import java.util.*;
public class EmpSet {
    public static void main(String[] args) {
        TreeSet hs = new TreeSet<>();
        //if it was
        //LinkedHashSet hs = new LinkedHashSet<>();
        //HashSet hs = new HashSet<>();
        //there would be no error
        hs.add(new Employee(100, "aaa", 1000));
        hs.add(new Employee(200, "bbb", 2000));
        hs.add(new Employee(300, "ccc", 3000));
        System.out.println(hs);
    }
}
