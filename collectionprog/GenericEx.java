package collectionprog;

import java.util.ArrayList;

public class GenericEx {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList();
        a1.add(10);
        a1.add(20);
        a1.add(30);
        display(a1);

        ArrayList<String> a2 = new ArrayList();
        a2.add("abc");
        a2.add("xyz");
        display(a2);
    }

    // public static void display(ArrayList<Integer> ar){ //if u give <integer> generic here, display(a2); will show error
    //     System.out.println(ar);
    // }
    // //so create diff display() for <String>
    // public static void display2(ArrayList<String> ar){ //if u give <integer> generic here, display(a2); will show error
    //     System.out.println(ar);
    // }
    //but 2 methods means redundant code so put them together
    public static void display(ArrayList<?> ar){ //if u give <integer> generic here, display(a2); will show error
        System.out.println(ar);
    }

    //but it worked fine with simply <> so y put <?>
    //suppose it shouldnt store char or string:

    // public static void display(ArrayList<? extends Number> ar){ //if u give <integer> generic here, display(a2); will show error
    //     System.out.println(ar);
    // }

}
//u can use generics with custom defined data types also

//the (ArrayList<? extends Number> ar) can also use interface also
//but we use extends only in case of generics, not implements
//(ArrayList<? extends InterfaceName> ar)

