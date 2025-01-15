import java.util.*;

// Node class for custom LinkedList implementations
class Node {
    int data;
    Node next;
    Node prev;  // For Doubly LinkedList

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class CollectionsDemo {
    // 1. Array Operations
    public static void arrayDemo() {
        System.out.println("\n=== Array Demo ===");
        int[] arr = new int[5];
        
        // Adding elements
        for(int i = 0; i < 5; i++) {
            arr[i] = i + 1;
        }
        
        System.out.print("Array elements: ");
        for(int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // 2. ArrayList Demo
    public static void arrayListDemo() {
        System.out.println("\n=== ArrayList Demo ===");
        ArrayList<Integer> list = new ArrayList<>();
        
        // Adding elements
        list.add(1);
        list.add(2);
        list.add(3);
        
        System.out.println("ArrayList elements: " + list);
        
        // Remove element
        list.remove(1);  // removes element at index 1
        System.out.println("After removing element at index 1: " + list);
        
        // Add at specific position
        list.add(1, 5);  // adds 5 at index 1
        System.out.println("After adding 5 at index 1: " + list);
    }

    // 3. Stack Demo
    public static void stackDemo() {
        System.out.println("\n=== Stack Demo ===");
        Stack<Integer> stack = new Stack<>();
        
        // Push elements
        stack.push(1);
        stack.push(2);
        stack.push(3);
        
        System.out.println("Stack elements: " + stack);
        
        // Pop element
        System.out.println("Popped element: " + stack.pop());
        
        // Peek at top element
        System.out.println("Top element: " + stack.peek());
    }

    // 4. Queue Demo
    public static void queueDemo() {
        System.out.println("\n=== Queue Demo ===");
        Queue<Integer> queue = new LinkedList<>();
        
        // Add elements
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        
        System.out.println("Queue elements: " + queue);
        
        // Remove element
        System.out.println("Removed element: " + queue.poll());
        
        // Peek at front element
        System.out.println("Front element: " + queue.peek());
    }

    // 5. HashSet Demo
    public static void hashSetDemo() {
        System.out.println("\n=== HashSet Demo ===");
        HashSet<Integer> set = new HashSet<>();
        
        // Add elements
        set.add(1);
        set.add(2);
        set.add(2);  // duplicate will not be added
        set.add(3);
        
        System.out.println("HashSet elements: " + set);
        
        // Check if element exists
        System.out.println("Contains 2? " + set.contains(2));
        
        // Remove element
        set.remove(2);
        System.out.println("After removing 2: " + set);
    }

    // 6. Custom Singly LinkedList
    static class SingleLinkedList {
        Node head;

        void add(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }

        void display() {
            Node current = head;
            System.out.print("Single LinkedList: ");
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }

    // 7. Custom Doubly LinkedList
    static class DoublyLinkedList {
        Node head;

        void add(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }

        void display() {
            Node current = head;
            System.out.print("Doubly LinkedList: ");
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Demo all collections
        arrayDemo();
        arrayListDemo();
        stackDemo();
        queueDemo();
        hashSetDemo();
        
        // Custom LinkedList demos
        System.out.println("\n=== Custom LinkedList Demos ===");
        SingleLinkedList sll = new SingleLinkedList();
        sll.add(1);
        sll.add(2);
        sll.add(3);
        sll.display();
        
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.add(1);
        dll.add(2);
        dll.add(3);
        dll.display();
    }
}