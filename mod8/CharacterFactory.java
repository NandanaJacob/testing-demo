package mod8;

public class CharacterFactory {

    public static Character createCharacter(String type, String name, int power, int wins) {
        if (type.equalsIgnoreCase("warrior")) {
            return new Character_Warrior(name, power, wins);
        } else if (type.equalsIgnoreCase("mage")) {
            return new Character_Mage(name, power, wins);
        } else if (type.equalsIgnoreCase("archer")) {
            return new Character_Archer(name, power, wins);
        }
        return null;  // Return null if no valid character type is provided
    }
}
