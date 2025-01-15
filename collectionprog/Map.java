package collectionprog;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Map {
    public static void main(String[] args) {
        HashMap hm = new HashMap<>();
        hm.put(101,"aaa");
        hm.put(102, "bbb");
        hm.put(103, "ccc");
        //try duplicate KEY
        hm.put(101, "ddd"); //replaces value sitting in 101
        hm.put(104, "aaa");
        System.out.println(hm);

        //checking to iterate => no immediate iterator method to use
        //=> convert the map object to a set or list

        Set s =  hm.entrySet(); //converts hm values to set type
        Iterator it = s.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        //check if key or value if present
        System.out.println(hm.containsKey(103));
        System.out.println(hm.containsValue("ppp"));
        //get a value
        System.out.println(hm.get(102)); //u give key, it gives corresponding value
        // while(it.hasNext()){
        //     Map.Entry me = (Map.Entry)it.next();
        //     System.out.println(me.getValue());
        //     System.out.println(me.getKey());
        // }
        //showing error for map.
    }
}
