package practise.mod6.collection;

public class all_general {
    static class Node{
        int data;
        Node previous;
        Node next;
        public Node(int data) {
            this.data = data;
            this.previous = null;
            this.next = null;
        }
    }
    static Node head;
    public static void insert(int data){
        if(head == null){
            head = new Node(data);
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = new Node(data);
        temp.next.previous = temp;
    }
    public static void delete(int data){
        //no element
        if(head == null){
            System.out.println("nothing to delete");
            return;
        }
        //only one element;
        if(head.data == data){
            System.out.println("printing head element: " + head.data);
            head = head.next;
            if(head!=null){
                System.out.println("now head is " + head.data);
                head.previous = null;
            }
            return;
        }
        //traverse
        Node temp = head;
        while(temp.data != data && temp!=null){
            temp = temp.next;
        }
        //now temp is the one u wanna remove
        if(temp.next != null)
            temp.next.previous = temp.previous;
        if(temp.previous != null)
            temp.previous.next = temp.next;
    }
    public static void display(){
        if(head == null){
            System.out.println("nothing to print");
        }
        Node temp = head;
        System.out.println("******* list *******");
        while(temp!=null){
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println();
        System.out.println("********************");
    }
    public static void main(String[] args) {
        all_general ag = new all_general();
        ag.insert(10);
        ag.display();
        ag.insert(20);
        ag.display();
        ag.insert(30);
        ag.display();
        System.out.println("deleting 20");
        ag.delete(20);
        ag.display();
        System.out.println("deleting 10");
        ag.delete(10);
        ag.display();
        System.out.println("deleting 30");
        ag.delete(30);
        ag.display();
        
    }
}
