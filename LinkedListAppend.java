import java.util.LinkedList;

public class LinkedListAppend{
    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> list = new LinkedList<>();

        // Add some initial elements
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Display the original list
        System.out.println("Original LinkedList: " + list);

        // Append a specified element
        String newElement = "Date";
        list.add(newElement);

        // Display the updated list
        System.out.println("Updated LinkedList: " + list);
    }
}
