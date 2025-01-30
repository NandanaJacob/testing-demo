package mod8;

//this is the facade class
public class ShapeCalculator_Facade {
    private Shape circle;
    private Shape ellipse;

    public void calculateCircle(double radius) {
        circle = new Circle(radius);
        System.out.println("Circle Area: " + circle.areaCalculation());
        System.out.println("Circle Perimeter: " + circle.perimeterCalculation());
    }

    public void calculateEllipse(double majorRadius, double minorRadius) {
        ellipse = new Ellipse(majorRadius, minorRadius);
        System.out.println("Ellipse Area: " + ellipse.areaCalculation());
        System.out.println("Ellipse Perimeter: " + ellipse.perimeterCalculation());
    }
}

