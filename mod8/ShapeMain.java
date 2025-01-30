package mod8;

import java.util.Scanner;

public class ShapeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Circle");
            System.out.println("2. Ellipse");
            System.out.println("3. Exit");
            System.out.print("Enter choice (1-3): ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter radius of the circle: ");
                double radius = sc.nextDouble();

                // Use factory to create a Circle object
                Shape circle = ShapeFactory.getShapeFactory(radius);

                System.out.println("Circle Area: " + circle.areaCalculation());
                System.out.println("Circle Perimeter: " + circle.perimeterCalculation());
            } 
            else if (choice == 2) {
                System.out.print("Enter long radius of the ellipse: ");
                double longRadius = sc.nextDouble();
                System.out.print("Enter short radius of the ellipse: ");
                double shortRadius = sc.nextDouble();

                // Use factory to create an Ellipse object
                Shape ellipse = ShapeFactory.getShapeFactory(longRadius, shortRadius);

                System.out.println("Ellipse Area: " + ellipse.areaCalculation());
                System.out.println("Ellipse Perimeter: " + ellipse.perimeterCalculation());
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
