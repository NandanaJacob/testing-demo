import java.util.TreeSet;

public class TreeSetCloneDemo {
    public static void main(String[] args) {
        // Create a TreeSet and add some elements
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Cherry");

        // Display the original TreeSet
        System.out.println("Original TreeSet: " + treeSet);

        // Clone the TreeSet
        TreeSet<String> clonedTreeSet = (TreeSet<String>) treeSet.clone();

        // Display the cloned TreeSet
        System.out.println("Cloned TreeSet: " + clonedTreeSet);
    }
}
