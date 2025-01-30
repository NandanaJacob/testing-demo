package mod8.Sandwich_BuilderPattern;

public class SandwichMain {
    public static void main(String[] args) {
        // Create the builder for Veggie Sandwich
        SandwichBuilder veggieBuilder = new VeggieSandwichBuilder_ConcreteBuilder();
        
        // Build the sandwich using the builder
        Sandwich_Product veggieSandwich = veggieBuilder.build();
        
        System.out.println("Veggie Sandwich: " + veggieSandwich);
        
        // Create the builder for Chicken Sandwich
        SandwichBuilder chickenBuilder = new ChickenSandwichBuilder_ConcreteBuilder();
        
        // Build the sandwich using the builder
        Sandwich_Product chickenSandwich = chickenBuilder.build();
        
        System.out.println("Chicken Sandwich: " + chickenSandwich);
    }
}
