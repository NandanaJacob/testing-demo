package factory;

// Client Code
public class Game {
    public static void main(String[] args) {
        // Using the factory to create different characters
        Character warrior = CharacterFactory.createCharacter("Warrior");
        warrior.attack();  

        Character mage = CharacterFactory.createCharacter("Mage");
        mage.attack();  

        Character archer = CharacterFactory.createCharacter("Archer");
        archer.attack(); 
    }
}
