// Achievement.java
import java.io.Serializable;
import java.time.LocalDateTime;

public class Achievement implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String id;
    private String name;
    private String description;
    private boolean unlocked;
    private LocalDateTime unlockedDate;
    
    public Achievement(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.unlocked = false;
    }
    
    public void unlock() {
        if (!unlocked) {
            unlocked = true;
            unlockedDate = LocalDateTime.now();
        }
    }
    
    // Getters
    public String getId() { return id; }
    public String getName() { return name; }
    public String getDescription() { return description; }
    public boolean isUnlocked() { return unlocked; }
    public LocalDateTime getUnlockedDate() { return unlockedDate; }
}