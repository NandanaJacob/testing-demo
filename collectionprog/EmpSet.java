package collectionprog;
import java.util.*;
public class EmpSet {
    public static void main(String[] args) {
        //You can define a custom Comparator to specify the sorting logic externally.
        Comparator<Employee> bySalary = Comparator.comparingInt(Employee::getSal);

        TreeSet hs = new TreeSet<>(bySalary); //no need of (bySalary) if option2
        //if it was
        //LinkedHashSet hs = new LinkedHashSet<>();
        //HashSet hs = new HashSet<>();
        //there would be no error


        hs.add(new Employee(101, "aaa", 3000));
        hs.add(new Employee(102, "bbb", 2000));
        hs.add(new Employee(103, "ccc", 1000));
        System.out.println(hs);
    }
}

/*
 * The issue arises because TreeSet requires that the objects it stores are comparable, 
 * or that a custom comparator is provided. Here's a detailed explanation:
 * 
 * 1. Why does TreeSet not allow storing Employee objects directly?
TreeSet is sorted: The TreeSet in Java sorts its elements in natural order 
(if the objects implement the Comparable interface) or in an order defined 
by a custom comparator provided at the time of TreeSet creation.
No comparison logic for Employee: The Employee class in your code does not 
implement the Comparable interface, nor have you provided a Comparator. 
As a result, the TreeSet cannot determine how to sort the Employee objects. 
This leads to a runtime error: ClassCastException.
In contrast:

HashSet and LinkedHashSet do not sort elements. 
They store objects in an unordered or insertion order, respectively. 
Since no comparison is required, you can store any object.
 * 
 * 2. How does TreeSet resolve data?
When you add an element to a TreeSet, it internally uses a binary search tree 
(usually a Red-Black Tree) to maintain the elements in sorted order.
Every time an element is added, the compareTo method (from Comparable) or the 
compare method (from Comparator) is used to determine the correct position of 
the new element in the tree.
Without comparison logic, the TreeSet cannot resolve where to place the new object.

3. How can you fix this issue?
You need to provide a way for the TreeSet to compare Employee objects. 
This can be done in two ways:

Option 1: Implement the Comparable interface in the Employee class
The Comparable interface allows you to define a natural order for your objects.
Option 2: Provide a Comparator when creating the TreeSet
You can define a custom Comparator to specify the sorting logic externally.

 */
