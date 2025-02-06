package factory;

// Factory Class
public class CharacterFactory {

    // Factory Method
    public static Character createCharacter(String characterType) {
        if (characterType == null) {
            return null;
        }
        
        if (characterType.equalsIgnoreCase("Warrior")) {
            return new Warrior();
        } else if (characterType.equalsIgnoreCase("Mage")) {
            return new Mage();
        } else if (characterType.equalsIgnoreCase("Archer")) {
            return new Archer();
        }
        
        return null;
    }
}

