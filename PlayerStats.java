// PlayerStats.java
import java.io.Serializable;

public class PlayerStats implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private int health;
    private int maxHealth;
    private int experience;
    private int level;
    private int coins;
    
    public PlayerStats() {
        this.health = 100;
        this.maxHealth = 100;
        this.experience = 0;
        this.level = 1;
        this.coins = 0;
    }
    
    public void gainExperience(int exp) {
        this.experience += exp;
        checkLevelUp();
    }
    
    private void checkLevelUp() {
        int experienceNeeded = level * 1000;
        if (experience >= experienceNeeded) {
            level++;
            experience -= experienceNeeded;
            maxHealth += 20;
            health = maxHealth;
        }
    }
    
    // Getters and setters
    public int getHealth() { return health; }
    public int getMaxHealth() { return maxHealth; }
    public int getExperience() { return experience; }
    public int getLevel() { return level; }
    public int getCoins() { return coins; }
    
    public void setHealth(int health) { 
        this.health = Math.min(health, maxHealth); 
    }
    public void addCoins(int amount) { this.coins += amount; }
}