package collectionprog;

import java.util.Arrays;

class Edge {
    int source, destination, weight;

    // Constructor for Edge
    public Edge(int source, int destination, int weight) {
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }
}

public class BellmanFord {
    private int vertices; // Number of vertices
    private Edge[] edges; // Array of edges

    // Constructor
    public BellmanFord(int vertices, int edgesCount) {
        this.vertices = vertices;
        edges = new Edge[edgesCount];
    }

    // Method to add edges to the graph
    public void addEdge(int index, int source, int destination, int weight) {
        edges[index] = new Edge(source, destination, weight);
    }

    // Bellman-Ford algorithm to find the shortest path
    public void bellmanFord(int source) {
        int[] distance = new int[vertices];
        // Initialize distances from the source to all vertices as infinite
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[source] = 0; // Distance from source to itself is 0

        // Relax all edges |V| - 1 times
        for (int i = 1; i < vertices; i++) {
            for (Edge edge : edges) {
                if (distance[edge.source] != Integer.MAX_VALUE &&
                    distance[edge.source] + edge.weight < distance[edge.destination]) {
                    distance[edge.destination] = distance[edge.source] + edge.weight;
                }
            }
        }

        // Check for negative-weight cycles
        for (Edge edge : edges) {
            if (distance[edge.source] != Integer.MAX_VALUE &&
                distance[edge.source] + edge.weight < distance[edge.destination]) {
                System.out.println("Graph contains negative weight cycle");
                return;
            }
        }

        // Print the shortest distances
        System.out.println("Vertex Distance from Source");
        for (int i = 0; i < vertices; i++) {
            System.out.println(i + "\t\t" + distance[i]);
        }
    }

    public static void main(String[] args) {
        int vertices = 5; // Number of vertices
        int edgesCount = 8; // Number of edges
        BellmanFord graph = new BellmanFord(vertices, edgesCount);

        // Add edges (source, destination, weight)
        graph.addEdge(0, 0, 1, -1);
        graph.addEdge(1, 0, 2, 4);
        graph.addEdge(2, 1, 2, 3);
        graph.addEdge(3, 1, 3, 2);
        graph.addEdge(4, 1, 4, 2);
        graph.addEdge(5, 3, 2, 5);
        graph.addEdge(6, 3, 1, 1);
        graph.addEdge(7, 4, 3, -3);

        int source = 0; // Starting vertex
        graph.bellmanFord(source);
    }
}
