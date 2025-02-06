package designPatterns;

// Component interface
interface Coffee {
    double cost();
    String description();
}

// Concrete component
class BasicCoffee implements Coffee {
    @Override
    public double cost() {
        return 5.0; // Basic cost of coffee
    }

    @Override
    public String description() {
        return "Basic Coffee";
    }
}

// Abstract decorator class
abstract class CoffeeDecorator implements Coffee {
    protected Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    public abstract double cost();
    public abstract String description();
}

// Concrete decorator for Milk
class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double cost() {
        return coffee.cost() + 1.5; // Adding cost of milk
    }

    @Override
    public String description() {
        return coffee.description() + " with Milk";
    }
}

// Concrete decorator for Sugar
class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double cost() {
        return coffee.cost() + 0.5; // Adding cost of sugar
    }

    @Override
    public String description() {
        return coffee.description() + " with Sugar";
    }
}

// Main class
public class DecoratorPatternExample {
    public static void main(String[] args) {
        Coffee myCoffee = new BasicCoffee();  // Start with basic coffee
        System.out.println(myCoffee.description() + " Cost: $" + myCoffee.cost());

        myCoffee = new MilkDecorator(myCoffee);  // Add milk
        System.out.println(myCoffee.description() + " Cost: $" + myCoffee.cost());

        myCoffee = new SugarDecorator(myCoffee);  // Add sugar
        System.out.println(myCoffee.description() + " Cost: $" + myCoffee.cost());
    }
}
