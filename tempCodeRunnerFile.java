// Main.java
public class Main1 {
    public static void main(String[] args) {
        try {
            // Create a new game state
            GameState gameState = new GameState("Player1");
            
            // Add some items to inventory
            InventoryItem sword = new InventoryItem("W001", "Steel Sword", ItemType.WEAPON, false);
            InventoryItem potion = new InventoryItem("C001", "Health Potion", ItemType.CONSUMABLE, true);
            gameState.getInventory().addItem(sword);
            gameState.getInventory().addItem(potion);
            
            // Add an achievement
            Achievement firstKill = new Achievement("A001", "First Blood", "Defeat your first enemy");
            firstKill.unlock();
            gameState.getAchievements().add(firstKill);
            
            // Update player stats
            gameState.getPlayerStats().gainExperience(1500);
            gameState.getPlayerStats().addCoins(1000);
            
            // Add level progress
            LevelProgress level1Progress = new LevelProgress(1);
            level1Progress.updateProgress(true, 3, 120.5, 10000);
            gameState.getLevelProgress().put(1, level1Progress);
            
            // Save the game
            System.out.println("Saving game...");
            GameSaveManager.saveGame(gameState, "save1");
            
            // Load the game
            System.out.println("Loading game...");
            GameState loadedState = GameSaveManager.loadGame("save1");
            
            // Verify loaded data
            System.out.println("\nLoaded Game State:");
            System.out.println("Player: " + loadedState.getPlayerName());
            System.out.println("Level: " + loadedState.getPlayerStats().getLevel());
            System.out.println("Coins: " + loadedState.getPlayerStats().getCoins());
            System.out.println("Inventory Items: " + loadedState.getInventory().getItems().size());
            System.out.println("Achievements: " + loadedState.getAchievements().size());
            System.out.println("Last Saved: " + loadedState.getLastSaved());
            
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}