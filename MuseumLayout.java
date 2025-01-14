import java.util.*;

class Exhibit {
    private String name;
    private int id;
    
    public Exhibit(String name, int id) {
        this.name = name;
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public int getId() {
        return id;
    }
    
    @Override
    public String toString() {
        return name + " (ID: " + id + ")";
    }
}

public class MuseumLayout {
    private Exhibit[] exhibits;
    private int[][] adjacencyMatrix;
    
    public MuseumLayout() {
        // Initialize exhibits
        exhibits = new Exhibit[] {
            new Exhibit("Monet's Water Lilies", 1),
            new Exhibit("Michelangelo's Pieta", 2),
            new Exhibit("Egyptian Sarcophagi", 3),
            new Exhibit("Picasso's Guernica", 4),
            new Exhibit("Van Gogh's Sunflowers", 5)
        };
        
        // Initialize adjacency matrix with walking times (in minutes)
        adjacencyMatrix = new int[][] {
            {0, 5, Integer.MAX_VALUE, 8, 3},    // From Exhibit 1 to others
            {5, 0, 4, 6, Integer.MAX_VALUE},    // From Exhibit 2 to others
            {Integer.MAX_VALUE, 4, 0, 5, 7},    // From Exhibit 3 to others
            {8, 6, 5, 0, 4},                    // From Exhibit 4 to others
            {3, Integer.MAX_VALUE, 7, 4, 0}     // From Exhibit 5 to others
        };
    }
    
    // Dijkstra's algorithm implementation
    private int[] dijkstra(int startVertex) {
        int numVertices = exhibits.length;
        int[] distances = new int[numVertices];
        boolean[] visited = new boolean[numVertices];
        
        Arrays.fill(distances, Integer.MAX_VALUE);
        distances[startVertex] = 0;
        
        for (int i = 0; i < numVertices - 1; i++) {
            int minVertex = findMinDistance(distances, visited);
            visited[minVertex] = true;
            
            for (int j = 0; j < numVertices; j++) {
                if (!visited[j] && 
                    adjacencyMatrix[minVertex][j] != Integer.MAX_VALUE && 
                    distances[minVertex] != Integer.MAX_VALUE && 
                    distances[minVertex] + adjacencyMatrix[minVertex][j] < distances[j]) {
                    distances[j] = distances[minVertex] + adjacencyMatrix[minVertex][j];
                }
            }
        }
        return distances;
    }
    
    private int findMinDistance(int[] distances, boolean[] visited) {
        int minDistance = Integer.MAX_VALUE;
        int minVertex = -1;
        
        for (int i = 0; i < distances.length; i++) {
            if (!visited[i] && distances[i] < minDistance) {
                minDistance = distances[i];
                minVertex = i;
            }
        }
        return minVertex;
    }
    
    // Plan optimal tour
    public void planTour(int startExhibitId, List<Integer> desiredExhibits) {
        System.out.println("\nPlanning tour starting from: " + exhibits[startExhibitId - 1].getName());
        System.out.println("Desired exhibits to visit: ");
        for (int id : desiredExhibits) {
            System.out.println("- " + exhibits[id - 1].getName());
        }
        
        // Add starting point to desired exhibits if not already included
        if (!desiredExhibits.contains(startExhibitId)) {
            desiredExhibits.add(startExhibitId);
        }
        
        List<Integer> tourPath = new ArrayList<>();
        tourPath.add(startExhibitId);
        int currentExhibit = startExhibitId;
        int totalTime = 0;
        
        // Create a copy of desired exhibits to track unvisited ones
        List<Integer> remainingExhibits = new ArrayList<>(desiredExhibits);
        remainingExhibits.remove(Integer.valueOf(startExhibitId));
        
        while (!remainingExhibits.isEmpty()) {
            int[] distances = dijkstra(currentExhibit - 1);
            
            // Find the closest unvisited desired exhibit
            int nextExhibit = -1;
            int minDistance = Integer.MAX_VALUE;
            
            for (int exhibitId : remainingExhibits) {
                if (distances[exhibitId - 1] < minDistance) {
                    minDistance = distances[exhibitId - 1];
                    nextExhibit = exhibitId;
                }
            }
            
            totalTime += minDistance;
            tourPath.add(nextExhibit);
            currentExhibit = nextExhibit;
            remainingExhibits.remove(Integer.valueOf(nextExhibit));
        }
        
        // Add return to start
        totalTime += adjacencyMatrix[currentExhibit - 1][startExhibitId - 1];
        tourPath.add(startExhibitId);
        
        // Print tour results
        System.out.println("\nOptimal Tour Route:");
        for (int i = 0; i < tourPath.size(); i++) {
            System.out.println((i + 1) + ". " + exhibits[tourPath.get(i) - 1].getName());
        }
        System.out.println("\nTotal tour time: " + totalTime + " minutes");
    }
    
    public static void main(String[] args) {
        MuseumLayout museum = new MuseumLayout();
        
        // Example tour: Start at Water Lilies (1) and visit Pieta (2), Guernica (4), and Sunflowers (5)
        List<Integer> desiredExhibits = new ArrayList<>(Arrays.asList(2, 4, 5));
        museum.planTour(1, desiredExhibits);
    }
}