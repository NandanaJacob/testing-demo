package mod8.Sandwich_BuilderPattern;

public class SandwichDirector {
    private SandwichBuilder builder;

    public SandwichDirector(SandwichBuilder builder) {
        this.builder = builder;
    }

    public Sandwich_Product makeSandwich() {
        builder.addBread();
        builder.addVegetables();
        builder.addMeats();
        builder.addSauces();
        return builder.build();
    }
}
