package mod8;

public class ShapeFactory {

    public static Shape getShapeFactory(double radius) {
        return new Circle(radius);  // Return Circle object
    }

    public static Shape getShapeFactory(double longRadius, double shortRadius) {
        return new Ellipse(longRadius, shortRadius);  // Return Ellipse object
    }
}

