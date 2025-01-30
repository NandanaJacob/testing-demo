package mod8.Sandwich_BuilderPattern;

public class VeggieSandwichBuilder_ConcreteBuilder implements SandwichBuilder {
    private Sandwich_Product sandwich;

    public VeggieSandwichBuilder_ConcreteBuilder() {
        sandwich = new Sandwich_Product();
    }

    @Override
    public void addBread() {
        sandwich.setBread("Whole Wheat Bread");
    }

    @Override
    public void addVegetables() {
        sandwich.setVegetables("Lettuce, Tomato, Onion");
    }

    @Override
    public void addMeats() {
        sandwich.setMeats("No Meat (Vegetarian)");
    }

    @Override
    public void addSauces() {
        sandwich.setSauces("Mustard, Mayonnaise");
    }

    @Override
    public Sandwich_Product build() {
        return sandwich;
    }
}
