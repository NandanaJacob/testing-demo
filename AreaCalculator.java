import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Display the menu
            System.out.println("Menu:");
            System.out.println("1. Calculate area of a circle");
            System.out.println("2. Calculate area of a rectangle");
            System.out.println("3. Calculate area of a triangle");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1: // Circle
                    System.out.print("Enter the radius of the circle: ");
                    double radius = scanner.nextDouble();
                    double circleArea = Math.PI * radius * radius;
                    System.out.printf("Area of the circle: %.2f\n", circleArea);
                    break;
                
                case 2: // Rectangle
                    System.out.print("Enter the length of the rectangle: ");
                    double length = scanner.nextDouble();
                    System.out.print("Enter the width of the rectangle: ");
                    double width = scanner.nextDouble();
                    double rectangleArea = length * width;
                    System.out.printf("Area of the rectangle: %.2f\n", rectangleArea);
                    break;

                case 3: // Triangle
                    System.out.print("Enter the base of the triangle: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter the height of the triangle: ");
                    double height = scanner.nextDouble();
                    double triangleArea = 0.5 * base * height;
                    System.out.printf("Area of the triangle: %.2f\n", triangleArea);
                    break;

                case 4: // Exit
                    System.out.println("Exiting the program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please select a valid option.");
            }

            System.out.println(); 

        } while (choice != 4); 

        scanner.close();
    }
}
