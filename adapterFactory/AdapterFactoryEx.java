package adapterFactory;

import java.util.Scanner;

// Target interface
interface Bird {
    void fly();
}

// Adaptee 1: Eagle (existing class with a different interface)
class Eagle {
    public void soar() {
        System.out.println("Eagle soars high in the sky");
    }
}

// Adaptee 2: Sparrow (existing class with a different interface)
class Sparrow {
    public void glide() {
        System.out.println("Sparrow glides for short distances");
    }
}

// Adapter for Eagle
class EagleAdapter implements Bird {
    private Eagle eagle;

    public EagleAdapter(Eagle eagle) {
        this.eagle = eagle;
    }

    @Override
    public void fly() {
        eagle.soar();  // Adapting the soar method to the fly method
    }
}

// Adapter for Sparrow
class SparrowAdapter implements Bird {
    private Sparrow sparrow;

    public SparrowAdapter(Sparrow sparrow) {
        this.sparrow = sparrow;
    }

    @Override
    public void fly() {
        sparrow.glide();  // Adapting the glide method to the fly method
    }
}

// Factory for creating Bird adapters
class BirdFactory {
    public Bird getBird(String birdType) {
        if (birdType == null) {
            return null;
        }

        if (birdType.equalsIgnoreCase("Eagle")) {
            return new EagleAdapter(new Eagle());  // Return EagleAdapter for Eagle
        } else if (birdType.equalsIgnoreCase("Sparrow")) {
            return new SparrowAdapter(new Sparrow());  // Return SparrowAdapter for Sparrow
        }
        return null;
    }
}

// Main class
public class AdapterFactoryEx {
    public static void main(String[] args) {
        BirdFactory birdFactory = new BirdFactory();
        Scanner sc = new Scanner(System.in);
        
        // Ask user for the bird type
        System.out.println("Enter the name of the bird (Eagle/Sparrow): ");
        String bird = sc.next();
        
        // Get the corresponding adapter for the bird type
        Bird b = birdFactory.getBird(bird);
        
        if (b != null) {
            b.fly();  // Call fly on the unified interface
        } else {
            System.out.println("Sorry, we do not support this bird type.");
        }
        
        sc.close();
    }
}
