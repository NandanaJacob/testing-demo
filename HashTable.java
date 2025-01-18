import java.util.LinkedList;

class HashTable {
    private static class HashNode {
        String key;
        String value;

        HashNode(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    private LinkedList<HashNode>[] table;
    private int capacity;

    @SuppressWarnings("unchecked")
    public HashTable(int size) {
        capacity = size;
        table = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            table[i] = new LinkedList<>();
        }
    }

    private int hash(String key) {
        return Math.abs(key.hashCode() % capacity);
    }

    public void insert(String key, String value) {
        int index = hash(key);
        for (HashNode node : table[index]) {
            if (node.key.equals(key)) {
                node.value = value; // Update value if key exists
                return;
            }
        }
        table[index].add(new HashNode(key, value)); // Add new key-value pair
    }

    public String retrieve(String key) {
        int index = hash(key);
        for (HashNode node : table[index]) {
            if (node.key.equals(key)) {
                return node.value; // Return value if key found
            }
        }
        return null; // Key not found
    }

    public void delete(String key) {
        int index = hash(key);
        for (HashNode node : table[index]) {
            if (node.key.equals(key)) {
                table[index].remove(node); // Remove key-value pair
                return;
            }
        }
    }

    public void display() {
        for (int i = 0; i < capacity; i++) {
            if (!table[i].isEmpty()) {
                System.out.print("Index " + i + ": ");
                for (HashNode node : table[i]) {
                    System.out.print("{" + node.key + ": " + node.value + "} ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        HashTable hashTable = new HashTable(10);

        // Sample dataset
        hashTable.insert("Alice", "Engineer");
        hashTable.insert("Bob", "Doctor");
        hashTable.insert("Charlie", "Artist");
        hashTable.insert("Diana", "Architect");

        // Displaying hash table
        System.out.println("Hash Table:");
        hashTable.display();

        // Retrieving values
        System.out.println("Retrieve Alice: " + hashTable.retrieve("Alice")); // Output: Engineer
        System.out.println("Retrieve Bob: " + hashTable.retrieve("Bob"));     // Output: Doctor

        // Deleting a value
        hashTable.delete("Bob");
        System.out.println("After deleting Bob:");
        hashTable.display(); // Bob should no longer be in the hash table
    }
}
