package hash;
import java.util.LinkedList;

public class HashTable{
    private static final int SIZE = 10; // Size of the hash table
    private LinkedList<Entry>[] table;

    // Entry class to store key-value pairs
    static class Entry {
        int key;
        String value;

        Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    // Constructor
    public HashTable() {
        table = new LinkedList[SIZE];
        for (int i = 0; i < SIZE; i++) {
            table[i] = new LinkedList<>();
        }
    }

    // Hash function to compute index
    private int hash(int key) {
        return key % SIZE;
    }

    // Add a key-value pair
    public void put(int key, String value) {
        int index = hash(key);
        for (Entry entry : table[index]) {
            if (entry.key == key) {
                entry.value = value; // Update value if key already exists
                return;
            }
        }
        table[index].add(new Entry(key, value)); // Add new entry
    }

    // Get the value for a key
    public String get(int key) {
        int index = hash(key);
        for (Entry entry : table[index]) {
            if (entry.key == key) {
                return entry.value;
            }
        }
        return null; // Key not found
    }

    // Remove a key-value pair
    public void remove(int key) {
        int index = hash(key);
        table[index].removeIf(entry -> entry.key == key);
    }

    // Print the hash table
    public void printTable() {
        for (int i = 0; i < SIZE; i++) {
            System.out.print("Index " + i + ": ");
            for (Entry entry : table[i]) {
                System.out.print("[" + entry.key + " -> " + entry.value + "] ");
            }
            System.out.println();
        }
    }

    // Main method to test the hash table
    public static void main(String[] args) {
        HashTable hashTable = new HashTable();

        hashTable.put(1, "One");
        hashTable.put(11, "Eleven");
        hashTable.put(21, "Twenty-One");

        System.out.println("After adding entries:");
        hashTable.printTable();

        System.out.println("Get value for key 11: " + hashTable.get(11));

        hashTable.remove(11);
        System.out.println("After removing key 11:");
        hashTable.printTable();
    }
}
