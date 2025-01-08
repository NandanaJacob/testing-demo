// LevelProgress.java
import java.io.Serializable;

public class LevelProgress implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private int levelNumber;
    private boolean completed;
    private int starsEarned;
    private double bestTime;
    private int highScore;
    
    public LevelProgress(int levelNumber) {
        this.levelNumber = levelNumber;
        this.completed = false;
        this.starsEarned = 0;
        this.bestTime = Double.MAX_VALUE;
        this.highScore = 0;
    }
    
    public void updateProgress(boolean completed, int stars, double time, int score) {
        this.completed = completed;
        this.starsEarned = Math.max(starsEarned, stars);
        this.bestTime = Math.min(bestTime, time);
        this.highScore = Math.max(highScore, score);
    }
    
    // Getters
    public int getLevelNumber() { return levelNumber; }
    public boolean isCompleted() { return completed; }
    public int getStarsEarned() { return starsEarned; }
    public double getBestTime() { return bestTime; }
    public int getHighScore() { return highScore; }
}
