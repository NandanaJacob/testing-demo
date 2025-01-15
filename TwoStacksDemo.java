class TwoStacks {
    private int[] array;      // Array to store elements
    private int size;         // Size of the array
    private int top1;         // Top index of first stack
    private int top2;         // Top index of second stack

    // Constructor
    public TwoStacks(int n) {
        size = n;
        array = new int[n];
        top1 = -1;           // First stack starts from left
        top2 = size;         // Second stack starts from right
    }

    // Push element x to first stack
    public void push1(int x) {
        // Check if there is space between top1 and top2
        if (top1 < top2 - 1) {
            top1++;
            array[top1] = x;
            System.out.println("Pushed " + x + " to first stack");
        } else {
            System.out.println("Stack Overflow");
        }
    }

    // Push element x to second stack
    public void push2(int x) {
        // Check if there is space between top1 and top2
        if (top1 < top2 - 1) {
            top2--;
            array[top2] = x;
            System.out.println("Pushed " + x + " to second stack");
        } else {
            System.out.println("Stack Overflow");
        }
    }

    // Pop element from first stack
    public int pop1() {
        if (top1 >= 0) {
            int x = array[top1];
            top1--;
            System.out.println("Popped " + x + " from first stack");
            return x;
        } else {
            System.out.println("Stack Underflow");
            return -1;
        }
    }

    // Pop element from second stack
    public int pop2() {
        if (top2 < size) {
            int x = array[top2];
            top2++;
            System.out.println("Popped " + x + " from second stack");
            return x;
        } else {
            System.out.println("Stack Underflow");
            return -1;
        }
    }
}

// Main class to test the implementation
public class TwoStacksDemo {
    public static void main(String[] args) {
        TwoStacks ts = new TwoStacks(5);

        // Pushing elements to first stack
        ts.push1(1);
        ts.push1(2);
        
        // Pushing elements to second stack
        ts.push2(10);
        ts.push2(9);
        
        // Pop elements from both stacks
        ts.pop1();
        ts.pop2();
        
        // Push more elements
        ts.push1(3);
        ts.push2(8);
    }
}