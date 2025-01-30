package mod8;

import java.util.Scanner;

public class Shape_Facade_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShapeCalculator_Facade shapeCalculator = new ShapeCalculator_Facade();

        while (true) {
            System.out.println("1. Circle");
            System.out.println("2. Ellipse");
            System.out.println("3. Exit");
            System.out.print("Enter choice (1-3): ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter radius of the circle: ");
                double radius = sc.nextDouble();
                // Use ShapeCalculator facade to calculate circle
                shapeCalculator.calculateCircle(radius);
            } 
            else if (choice == 2) {
                System.out.print("Enter major radius of the ellipse: ");
                double majorRadius = sc.nextDouble();
                System.out.print("Enter minor radius of the ellipse: ");
                double minorRadius = sc.nextDouble();
                // Use ShapeCalculator facade to calculate ellipse
                shapeCalculator.calculateEllipse(majorRadius, minorRadius);
            } 
            else if (choice == 3) {
                System.out.println("Exiting...");
                break;
            } 
            else {
                System.out.println("Invalid choice. Please choose between 1 and 3.");
            }
        }
        
        sc.close();
    }
}
