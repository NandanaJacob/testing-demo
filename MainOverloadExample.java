public class MainOverloadExample {
    // Standard main method
    public static void main(String[] args) {
        System.out.println("Main method with String[] args");
        main(42); // Calling an overloaded main method
        main("Hello");
    }

    // Overloaded main methods
    public static void main(int number) {
        System.out.println("Main method with int argument: " + number);
    }

    public static void main(String message) {
        System.out.println("Main method with String argument: " + message);
    }
}
