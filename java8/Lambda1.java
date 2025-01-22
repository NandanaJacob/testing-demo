package java8;
import java.util.Comparator;
import java.util.ArrayList;


public class Lambda1 {
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<String>();
        a1.add("swedha");
        a1.add("kishore");
        a1.add("keerthi");
        a1.add("Shivam");
        a1.add("adam");
        a1.add("eve");
        a1.add("jo");
        System.out.println(a1);
        //im giving logic for comparator sore sort function
        // a1.sort(new Comparator<String>(){
        //     public int compare(String s1, String s2){
        //         return Integer.compare(s1.length(), s2.length());
        //     }
        // });
        //creating lambda expression for same logic
        a1.sort( (s1,s2) -> Integer.compare(s1.length(), s2.length()));

        System.out.println(a1);
    }
}
