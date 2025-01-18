package collectionprog;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class Map {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(101, "aaa");
        hm.put(102, "bbb");
        hm.put(103, "ccc");
        //try duplicate KEY
        hm.put(101, "ddd"); //replaces value sitting in 101
        hm.put(104, "aaa");
        System.out.println(hm);

        // checking to iterate => no immediate iterator method to use
        // => convert the map object to a set or list

        Set<Entry<Integer, String>> s = hm.entrySet(); // converts hm values to set type
        Iterator<Entry<Integer, String>> it = s.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // check if key or value is present
        System.out.println(hm.containsKey(103));
        System.out.println(hm.containsValue("ppp"));
        // get a value
        System.out.println(hm.get(102)); // u give key, it gives corresponding value

        hm.putIfAbsent(120, "Apple");
        System.out.println(hm);
        hm.put(109, "ball");
        System.out.println(hm);
        hm.put(110, "zzz");
        System.out.println(hm);

        // Create a list from the entries of the HashMap
        List<Entry<Integer, String>> entryList = new ArrayList<>(hm.entrySet());

        // Sort the list by values
        entryList.sort(Comparator.comparing(Entry::getValue));

        // Create a TreeMap to maintain the order
        TreeMap<Integer, String> sortedMap = new TreeMap<>();

        // Put sorted entries into the TreeMap
        for (Entry<Integer, String> entry : entryList) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        // Display sorted entries by value
        System.out.println("Sorted entries by value:");
        for (Entry<Integer, String> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
