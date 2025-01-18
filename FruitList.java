import java.util.LinkedList;
import java.util.ListIterator;

public class FruitList {

    public static void main(String[] args) {
        // Create a LinkedList of fruits
        LinkedList<String> l1 = new LinkedList<>();

        // Add five fruits to the LinkedList
        l1.add("Apple");
        l1.add("Banana");
        l1.add("Cherry");
        l1.add("Date");
        l1.add("Elderberry");

        // Create a ListIterator to iterate through the list
        ListIterator<String> listIterator = l1.listIterator();

        System.out.println("Fruits in the list:");
        // Iterate through the LinkedList and print each fruit
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
    }
}
