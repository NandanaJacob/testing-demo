import java.util.Arrays;

public class DijkstraShortestPath {

    // Method to find the vertex with the minimum distance value
    static int minDistance(int[] distance, boolean[] sptSet) {
        int min = Integer.MAX_VALUE, minIndex = -1;

        for (int v = 0; v < distance.length; v++) {
            if (!sptSet[v] && distance[v] <= min) {
                min = distance[v];
                minIndex = v;
            }
        }
        return minIndex;
    }

    // Method that implements Dijkstra's algorithm for a graph
    static void dijkstra(int[][] graph, int source) {
        int vertices = graph.length;
        int[] distance = new int[vertices]; // Output array
        boolean[] sptSet = new boolean[vertices]; // Shortest path tree set

        // Initialize all distances as infinite and sptSet[] as false
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[source] = 0; // Distance from source to itself is always 0

        // Calculate shortest path for all vertices
        for (int count = 0; count < vertices - 1; count++) {
            // Get the minimum distance vertex from the set of vertices not yet processed
            int u = minDistance(distance, sptSet);
            sptSet[u] = true; // Mark the picked vertex as processed

            // Update distance value of the adjacent vertices of the picked vertex
            for (int v = 0; v < vertices; v++) {
                if (!sptSet[v] && graph[u][v] != 0 && distance[u] != Integer.MAX_VALUE
                        && distance[u] + graph[u][v] < distance[v]) {
                    distance[v] = distance[u] + graph[u][v];
                }
            }
        }

        // Print the calculated shortest distances
        System.out.println("Vertex \t Distance from Source");
        for (int i = 0; i < vertices; i++) {
            System.out.println(i + " \t " + distance[i]);
        }
    }

    public static void main(String[] args) {
        // First test graph (original)
        System.out.println("Test Case 1 - Original Graph:");
        int[][] graph1 = {
                {0, 4, 0, 0, 0, 0, 0, 8, 0},
                {4, 0, 8, 0, 0, 0, 0, 0, 0},
                {0, 8, 0, 7, 0, 4, 0, 0, 2},
                {0, 0, 7, 0, 9, 0, 0, 0, 0},
                {0, 0, 0, 9, 0, 10, 0, 0, 0},
                {0, 0, 4, 0, 10, 0, 2, 0, 0},
                {0, 0, 0, 0, 0, 2, 0, 1, 6},
                {8, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 2, 0, 0, 0, 6, 0, 0}
        };
        dijkstra(graph1, 0);
    
        // Second test graph - more dense with different weights
        System.out.println("\nTest Case 2 - Dense Graph with Different Weights:");
        int[][] graph2 = {
                {0, 2, 4, 0, 0, 0},
                {2, 0, 1, 7, 0, 0},
                {4, 1, 0, 3, 5, 0},
                {0, 7, 3, 0, 2, 8},
                {0, 0, 5, 2, 0, 3},
                {0, 0, 0, 8, 3, 0}
        };
        dijkstra(graph2, 0);
    }
}
