//Prototype Interface
interface Prototype {
    Prototype clone(); // Clone method
    }
    //Abstract class implementing the Prototype interface
    abstract class Shape implements Prototype {
    int x, y;
    String color;
    
    public Shape() {} // Default constructor
    
    // Copy constructor (for cloning)
    public Shape(Shape source) {
   if (source != null) {
     this.x = source.x;
     this.y = source.y;
     this.color = source.color;
     }
    }
    
    @Override
    public abstract Shape clone(); // Clone method to be implemented by subclasses
    
    public void display() {
     System.out.println(this.getClass().getSimpleName() +
     " [x=" + x + ", y=" + y + ", color=" + color + "]");
    }
    }
    class Circle extends Shape {
    int radius;

    public Circle() {} // Default constructor
    
    public Circle(Circle source) {
     super(source);// call a copy constructor of parent 
     if (source != null) {
     this.radius = source.radius;
     }
    }
    
    @Override
    public Shape clone() {
     return new Circle(this);
    }
    }
    class Rectangle extends Shape {
    int width, height;
    
    public Rectangle() {} // Default constructor
    
    public Rectangle(Rectangle source) {
     super(source);
     if (source != null) {
     this.width = source.width;
     this.height = source.height;
     }
    }
    
    @Override
    public Shape clone() {
     return new Rectangle(this);
    }
    }
    public class PrototypePatternDemo {
    public static void main(String[] args) {
     Circle originalCircle = new Circle();
     originalCircle.x = 10;
     originalCircle.y = 20;
     originalCircle.radius = 5;
     originalCircle.color = "Red";
    
    
     Circle clonedCircle = (Circle) originalCircle.clone();
     clonedCircle.color = "Blue"; // Modify cloned object
    
    
     System.out.println("Original:");
     originalCircle.display();
    
     System.out.println("\nCloned:");
     clonedCircle.display();
    
    
     Rectangle originalRectangle = new Rectangle();
     originalRectangle.x = 5;
     originalRectangle.y = 10;
     originalRectangle.width = 15;
     originalRectangle.height = 20;
     originalRectangle.color = "Green";
    
     Rectangle clonedRectangle = (Rectangle) originalRectangle.clone();
     clonedRectangle.color = "Yellow"; // Modify cloned object
    
     System.out.println("\nOriginal Rectangle:");
     originalRectangle.display();
    
     System.out.println("\nCloned Rectangle:");
     clonedRectangle.display();
    }
    }
    