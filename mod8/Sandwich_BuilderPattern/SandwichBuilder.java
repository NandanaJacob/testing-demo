package mod8.Sandwich_BuilderPattern;

public interface SandwichBuilder {
    void addBread();
    void addVegetables();
    void addMeats();
    void addSauces();
    Sandwich_Product build();  // Return the constructed sandwich
}
