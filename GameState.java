// GameState.java
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.*;

public class GameState implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String playerName;
    private int currentLevel;
    private double playTime;
    private LocalDateTime lastSaved;
    private PlayerStats playerStats;
    private Inventory inventory;
    private Set<Achievement> achievements;
    private Map<Integer, LevelProgress> levelProgress;
    
    public GameState(String playerName) {
        this.playerName = playerName;
        this.currentLevel = 1;
        this.playTime = 0.0;
        this.lastSaved = LocalDateTime.now();
        this.playerStats = new PlayerStats();
        this.inventory = new Inventory();
        this.achievements = new HashSet<>();
        this.levelProgress = new HashMap<>();
    }
    
    public void updateLastSaved() {
        this.lastSaved = LocalDateTime.now();
    }
    
    // Getters and setters
    public String getPlayerName() { return playerName; }
    public int getCurrentLevel() { return currentLevel; }
    public double getPlayTime() { return playTime; }
    public LocalDateTime getLastSaved() { return lastSaved; }
    public PlayerStats getPlayerStats() { return playerStats; }
    public Inventory getInventory() { return inventory; }
    public Set<Achievement> getAchievements() { return achievements; }
    public Map<Integer, LevelProgress> getLevelProgress() { return levelProgress; }
    
    public void setCurrentLevel(int level) { this.currentLevel = level; }
    public void addPlayTime(double hours) { this.playTime += hours; }
}