package hash;
import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        // Create a LinkedHashMap
        LinkedHashMap<Integer, String> linkedMap = new LinkedHashMap<>();

        // Add key-value pairs
        linkedMap.put(1, "One");
        linkedMap.put(2, "Two");
        linkedMap.put(3, "Three");

        // Iterate through the LinkedHashMap
        System.out.println("Key-Value pairs in insertion order:");
        for (var entry : linkedMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
