package mod8;

public class Character_Mage implements Character {
    private String name;
    private int power;
    private int wins;

    public Character_Mage(String name, int power, int wins) {
        this.name = name;
        this.power = power;
        this.wins = wins;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPower() {
        return power;
    }

    @Override
    public int getWins() {
        return wins;
    }
}

