package collectionprog;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
//import java.util.LinkedList.LinkedList();

public class LinkListEx {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        //either directly create instance of linked list
        //or create reference variable of linkedlist and instantiate it

        @SuppressWarnings("rawtypes")
        List l1 = new LinkedList(); //douvly linked list
        l1.add(10);
        l1.add(20);
        l1.add(30);
        //there is seperate iterator for linked list
        ListIterator it = l1.listIterator();
        while(it.hasNext()){
            System.out.println(it.hasPrevious());
            System.out.println(it.hasNext());
            System.out.println(it.nextIndex());
            System.out.println(it.next());
            //java doesnt support pointer, then how is linklist possible?
            //internally pointers are working but user cananot explicitly handle those pointers
            //=>every node has address of next and previous node
            System.out.println("========");
        }

    }
    
}
