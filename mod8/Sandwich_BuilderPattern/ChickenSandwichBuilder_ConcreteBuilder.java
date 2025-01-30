package mod8.Sandwich_BuilderPattern;

public class ChickenSandwichBuilder_ConcreteBuilder implements SandwichBuilder {
    private Sandwich_Product sandwich;

    public ChickenSandwichBuilder_ConcreteBuilder() {
        sandwich = new Sandwich_Product();
    }

    @Override
    public void addBread() {
        sandwich.setBread("White Bread");
    }

    @Override
    public void addVegetables() {
        sandwich.setVegetables("Lettuce, Tomato");
    }

    @Override
    public void addMeats() {
        sandwich.setMeats("Grilled Chicken");
    }

    @Override
    public void addSauces() {
        sandwich.setSauces("BBQ Sauce");
    }

    @Override
    public Sandwich_Product build() {
        return sandwich;
    }
}

