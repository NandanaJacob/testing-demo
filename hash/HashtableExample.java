package hash;

import java.util.Hashtable;

public class HashtableExample {
    public static void main(String[] args) {
        // Create a Hashtable
        Hashtable<Integer, String> table = new Hashtable<>();

        // Add key-value pairs
        table.put(1, "One");
        table.put(2, "Two");
        table.put(3, "Three");

        // Retrieve a value by key
        System.out.println("Value for key 1: " + table.get(1));

        // Remove a key-value pair
        table.remove(3);

        // Iterate through the Hashtable
        System.out.println("Key-Value pairs:");
        for (var entry : table.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
