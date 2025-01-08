// GameSaveManager.java
import java.io.*;
import java.nio.file.*;
import java.util.zip.*;

public class GameSaveManager {
    private static final String SAVE_DIRECTORY = "game_saves";
    
    public static void saveGame(GameState gameState, String saveName) throws IOException {
        // Create save directory if it doesn't exist
        Files.createDirectories(Paths.get(SAVE_DIRECTORY));
        
        // Update last saved timestamp
        gameState.updateLastSaved();
        
        // Create save file path
        String saveFileName = String.format("%s/%s.sav", SAVE_DIRECTORY, saveName);
        
        // Serialize and compress the game state
        try (FileOutputStream fos = new FileOutputStream(saveFileName);
             GZIPOutputStream gzos = new GZIPOutputStream(fos);
             ObjectOutputStream oos = new ObjectOutputStream(gzos)) {
            
            oos.writeObject(gameState);
        }
    }
    
    public static GameState loadGame(String saveName) throws IOException, ClassNotFoundException {
        String saveFileName = String.format("%s/%s.sav", SAVE_DIRECTORY, saveName);
        
        // Decompress and deserialize the game state
        try (FileInputStream fis = new FileInputStream(saveFileName);
             GZIPInputStream gzis = new GZIPInputStream(fis);
             ObjectInputStream ois = new ObjectInputStream(gzis)) {
            
            return (GameState) ois.readObject();
        }
    }
}