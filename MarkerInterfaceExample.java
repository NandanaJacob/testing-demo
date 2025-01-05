import java.io.Serializable;

class MyClass implements Serializable {
    // This class is marked as Serializable but doesn't define any method for it
}

public class MarkerInterfaceExample {
    public static void main(String[] args) {
        MyClass obj = new MyClass();

        // Check if the object is marked as Serializable
        if (obj instanceof Serializable) {
            System.out.println("This object is Serializable.");
        } else {
            System.out.println("This object is NOT Serializable.");
        }
    }
}
