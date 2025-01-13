package collectionprog;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx{
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        @SuppressWarnings("rawtypes")
        ArrayList a1 = new ArrayList();
        //adding generics:
        ArrayList <Integer> al = new ArrayList<>();
        a1.add(23);
        a1.add("sandy");
        a1.add(23.3);
        System.out.println(a1);
        Iterator it = a1.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        //shows error if not int values are stored. corrected error.
        al.add(23);
        al.add(24);
        al.add(25);
        System.out.println(al);
    }
}
