package mod8;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double perimeterCalculation() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double areaCalculation() {
        return Math.PI * Math.pow(radius, 2);
    }
}

