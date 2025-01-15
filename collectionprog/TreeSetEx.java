package collectionprog;

import java.util.*;

public class TreeSetEx{
    public static void main(String[] args) {
        TreeSet hs = new TreeSet<>();
        hs.add("nandana");
        hs.add("lakshmi");
        hs.add("jacob");
        System.out.println(hs); //printed in proper ascending or alphabetic order
        //=> data stored in set is ordered
        //hs.add(21);
        hs.add("naomi");
        System.out.println(hs); //naomi is entered in the end
        //adding duplicates:
        hs.add("nandana");
        //null value cant be given in tree set
        //hs.add(null);
        //System.out.println(hs);
        //more than one null =>not possible cus thats then a duplicate
        //hs.add(null);
        //System.out.println(hs);

        //in btw string values in the tree, these are ordered alphabetically
        //if u add int value in btw, it will show error
    }
}

//1. hashset
// 2. linked hash Set
// 3. tree set

// set classes wont let us store duplicates
