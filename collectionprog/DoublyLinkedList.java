package collectionprog;

public class DoublyLinkedList {
    // Node class
    static class Node {
        int data;
        Node previous;
        Node next;

        // Constructor to create a new node
        Node(int data) {
            this.data = data;
            this.previous = null;
            this.next = null;
        }
    }

    // Head of the doubly linked list
    private Node head;

    // Method to insert a new node at the end
    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode; // If the list is empty, set head to the new node
        } else {
            Node temp = head;
            while (temp.next != null) { // Traverse to the end of the list
                temp = temp.next;
            }
            temp.next = newNode; // Set the new node at the end
            newNode.previous = temp; // Link the new node to the previous node
        }
    }

    // Method to delete a node by value
    public void delete(int data) {
        if (head == null) {
            System.out.println("List is empty. Nothing to delete.");
            return;
        }

        Node temp = head;

        // If the node to be deleted is the head
        if (temp.data == data) {
            head = head.next; // Move head to the next node
            if (head != null) {
                head.previous = null; // Set the new head's previous to null
            }
            return;
        }

        // Traverse to find the node to delete
        while (temp != null && temp.data != data) {
            temp = temp.next;
        }

        if (temp == null) { // If the node is not found
            System.out.println("Node not found.");
            return;
        }

        // If the node to be deleted is in the middle or end
        if (temp.next != null) {
            temp.next.previous = temp.previous;
        }

        if (temp.previous != null) {
            temp.previous.next = temp.next;
        }
    }

    // Method to display the linked list
    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = head;
        System.out.println("Doubly Linked List:");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        // Insert elements
        dll.insert(10);
        dll.insert(20);
        dll.insert(30);
        dll.insert(40);

        // Display the list
        dll.display();

        // Delete an element
        System.out.println("Deleting 20...");
        dll.delete(20);

        // Display the list again
        dll.display();

        // Attempt to delete a non-existent element
        System.out.println("Deleting 50...");
        dll.delete(50);

        // Display the list again
        dll.display();
    }
}
