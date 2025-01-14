package hash;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // Add key-value pairs
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        // Retrieve a value by key
        System.out.println("Value for key 2: " + map.get(2));

        // Remove a key-value pair
        map.remove(3);

        // Check if a key or value exists
        System.out.println("Contains key 1: " + map.containsKey(1));
        System.out.println("Contains value 'Three': " + map.containsValue("Three"));

        // Iterate through the HashMap
        System.out.println("Key-Value pairs:");
        for (var entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        System.out.println(map.entrySet());
    }
}
