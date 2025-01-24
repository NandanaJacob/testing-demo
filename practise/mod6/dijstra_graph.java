package practise.mod6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class dijstra_graph {
    static int[][] adjacency_matrix = {
        {0, 5, Integer.MAX_VALUE, 8, 3},    // From Exhibit 1 to others
        {5, 0, 4, 6, Integer.MAX_VALUE},    // From Exhibit 2 to others
        {Integer.MAX_VALUE, 4, 0, 5, 7},    // From Exhibit 3 to others
        {8, 6, 5, 0, 4},                    // From Exhibit 4 to others
        {3, Integer.MAX_VALUE, 7, 4, 0}     // From Exhibit 5 to others
    };
    
    static int[] distance = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE};
    static int[] visited = {0, 0, 0, 0, 0};
    static int n = 5; // Number of vertices
    static int min_index;  // For tracking the vertex with the minimum distance
    static List<Integer> path = new ArrayList<>();
    
    public static void pathFromI(int start_index) {
        // Initialize distances and visited status
        for (int k = 0; k < n; k++) {
            if (k == start_index) {
                distance[k] = 0;
            } else {
                distance[k] = Integer.MAX_VALUE;
            }
        }
        
        // Start finding the shortest path visiting all vertices
        for (int i = 0; i < n; i++) {
            // Find the next vertex with the smallest distance and mark it as visited
            min_index = min_value_in_distance(distance);
            visited[min_index] = 1;
            path.add(min_index); // Add to the path
            System.out.println("Visiting vertex " + min_index);

            // Update the distances to the adjacent unvisited vertices
            for (int j = 0; j < n; j++) {
                if (visited[j] == 0 && adjacency_matrix[min_index][j] != Integer.MAX_VALUE) {
                    // Calculate the new distance if the path through min_index is shorter
                    int newDist = adjacency_matrix[min_index][j] + distance[min_index];
                    if (newDist < distance[j]) {
                        distance[j] = newDist;
                    }
                }
            }
        }

        // Output the final path and distance
        System.out.println("The shortest path visiting all vertices is:");
        System.out.println(path);
        System.out.println("Total distance: " + distance[min_index]);
    }
    
    // Method to find the vertex with the minimum distance that hasn't been visited
    public static int min_value_in_distance(int[] distance) {
        int min_value = Integer.MAX_VALUE;
        int min_index = -1;
        for (int i = 0; i < n; i++) {
            if (distance[i] < min_value && visited[i] == 0) {
                min_value = distance[i];
                min_index = i;
            }
        }
        System.out.println("Current min_index is " + min_index);
        return min_index;
    }
    
    public static void main(String[] args) {
        System.out.println("The graph looks like:");
        for (int[] row : adjacency_matrix) {
            System.out.println(Arrays.toString(row));
        }
        
        int start_index = 0; // Start from vertex 0
        System.out.println("\nFinding the shortest path starting from vertex " + start_index);
        pathFromI(start_index);
    }
}
