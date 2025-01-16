package collectionprog;

import java.util.*;

public class LinkedSetEx {
    public static void main(String[] args) {
        LinkedHashSet hs = new LinkedHashSet<>();
        hs.add("nandana");
        hs.add("lakshmi");
        hs.add("jacob");
        System.out.println(hs); //printed in same order
        //=> data stored in set is ordered
        hs.add("naomi");
        System.out.println(hs); //naomi is entered in the end
        //adding duplicates:
        hs.add("nandana");
        //wont show any errors in compile or runtime
        //just tht no new hashcode is made for this value
        //adding null value
        hs.add(null);
        System.out.println(hs);
        //more than one null =>not possible cus thats then a duplicate
        hs.add(null);
        System.out.println(hs);
    }
}

//1. hashset
// 2. linked hash Set
// 3. tree set

// set classes wont let us store duplicates
