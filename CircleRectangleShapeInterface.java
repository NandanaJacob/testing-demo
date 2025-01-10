

// Circle class implementing the Shape interface
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius; // Area of the circle
    }

    @Override
    public void displayShapeInfo() {
        System.out.println("Shape: Circle");
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
    }
}

// Rectangle class implementing the Shape interface
class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width; // Area of the rectangle
    }

    @Override
    public void displayShapeInfo() {
        System.out.println("Shape: Rectangle");
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + calculateArea());
    }
}

// Main class to demonstrate the interface usage
public class CircleRectangleShapeInterface{
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);          // Create a Circle instance
        Shape rectangle = new Rectangle(4.0, 6.0); // Create a Rectangle instance

        circle.displayShapeInfo();  // Display Circle info
        System.out.println();        // Blank line for better output separation
        rectangle.displayShapeInfo(); // Display Rectangle info
    }
}
