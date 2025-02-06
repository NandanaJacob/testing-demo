package DecoratorPattern;

public class CoffeeShop {
     public static void main(String[] args) {
     Coffee coffee = new SimpleCoffee();
     System.out.println(coffee.getDescription() + " Cost: $" + coffee.cost());
    
     coffee = new Milk(coffee);
     System.out.println(coffee.getDescription() + " Cost: $" + coffee.cost());
    
     coffee = new Sugar(coffee);
     System.out.println(coffee.getDescription() + " Cost: $" + coffee.cost());
     }
    }
    
