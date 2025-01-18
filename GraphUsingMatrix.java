public class GraphUsingMatrix {
    private int[][] adjacencyMatrix;
    private int vertexCount;
    private final int maxSize;
    
    public GraphUsingMatrix(int maxSize) {
        this.maxSize = maxSize;
        this.vertexCount = 0;
        this.adjacencyMatrix = new int[maxSize][maxSize];
        
        // Initialize the matrix with all zeros
        for (int i = 0; i < maxSize; i++) {
            for (int j = 0; j < maxSize; j++) {
                adjacencyMatrix[i][j] = 0;
            }
        }
    }
    
    // Add a new vertex to the graph
    public boolean addVertex() {
        if (vertexCount >= maxSize) {
            System.out.println("Maximum graph size reached");
            return false;
        }
        vertexCount++;
        return true;
    }
    
    // Add an edge between two vertices
    public boolean addEdge(int start, int end) {
        if (start >= vertexCount || end >= vertexCount || start < 0 || end < 0) {
            System.out.println("Invalid vertex numbers");
            return false;
        }
        
        // Add edge (undirected graph - symmetric matrix)
        adjacencyMatrix[start][end] = 1;
        adjacencyMatrix[end][start] = 1;
        return true;
    }
    
    // Print the adjacency matrix
    public void printGraph() {
        System.out.println("\nAdjacency Matrix:");
        System.out.print("  ");
        for (int i = 0; i < vertexCount; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        for (int i = 0; i < vertexCount; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < vertexCount; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        // Create a graph with maximum 9 vertices
        GraphUsingMatrix graph = new GraphUsingMatrix(9);
        
        // Add vertices
        for (int i = 0; i < 9; i++) {
            graph.addVertex();
        }
        
        // Add the same edges as in your example
        graph.addEdge(0, 3);
        graph.addEdge(0, 4);
        graph.addEdge(0, 7);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 5);
        graph.addEdge(1, 8);
        graph.addEdge(2, 5);
        graph.addEdge(6, 7);
        graph.addEdge(6, 8);
        graph.addEdge(6, 0);
        
        // Print the graph
        graph.printGraph();
    }
}