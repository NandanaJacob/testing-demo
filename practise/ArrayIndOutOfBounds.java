// You are given a program skeleton that involves an array and a method accessing an element. Your
// task is to complete the program by adding the necessary exception-handling code to catch and
// handle the ArrayIndexOutOfBoundsException that may occur if an invalid index is accessed.
package practise;

public class ArrayIndOutOfBounds {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        try {
            int result = accessArrayElement(numbers, 10);
            System.out.println("Result: " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        }
    }
    private static int accessArrayElement(int[] array, int index) {
        if (index < 0 || index >= array.length) {
            throw new ArrayIndexOutOfBoundsException("Invalid array index");
        }
        return array[index];
    }
}
