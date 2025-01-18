import java.util.LinkedList;
import java.util.Iterator;
import java.util.Queue;
import java.util.Stack;

public class GraphUsingLinkedList {
    
    static class NetworkGraph {
        int vertex;
        LinkedList<Integer> myNetwork[]; // adjacency list
        
        public NetworkGraph(int vertex) {
            this.vertex = vertex;
            myNetwork = new LinkedList[vertex];
            // Create one LinkedList for each vertex
            for (int i = 0; i < vertex; i++) {
                myNetwork[i] = new LinkedList<>();
            }
        }
    }

    public static void main(String[] args) {
        int vertex = 9;
        NetworkGraph graph = new NetworkGraph(vertex);
        
        // Adding edges to the graph
        addVertexEdge(graph, 0, 3);
        addVertexEdge(graph, 0, 4);
        addVertexEdge(graph, 0, 7);
        addVertexEdge(graph, 1, 2);
        addVertexEdge(graph, 1, 3);
        addVertexEdge(graph, 1, 5);
        addVertexEdge(graph, 1, 8);
        addVertexEdge(graph, 2, 5);
        addVertexEdge(graph, 6, 7);
        addVertexEdge(graph, 6, 8);
        addVertexEdge(graph, 6, 0);

        // Print the adjacency list representation of the graph
        for (int i = 0; i < vertex; i++) {
            System.out.println(i + " = " + graph.myNetwork[i]);
        }

        // Perform BFS and DFS
        System.out.println("Breadth-First Search starting from vertex 0:");
        bfs(graph, 0);

        System.out.println("\nDepth-First Search starting from vertex 0:");
        dfs(graph, 0);
    }

    public static void addVertexEdge(NetworkGraph graph, int startv, int endv) {
        graph.myNetwork[startv].add(endv);
        graph.myNetwork[endv].add(startv);
    }

    // Breadth-First Search
    public static void bfs(NetworkGraph graph, int startVertex) {
        boolean[] visited = new boolean[graph.vertex]; // Track visited vertices
        Queue<Integer> queue = new LinkedList<>(); // Queue for BFS

        visited[startVertex] = true; // Mark the start vertex as visited
        queue.add(startVertex); // Add start vertex to the queue

        while (!queue.isEmpty()) {
            int currentVertex = queue.poll(); // Dequeue a vertex
            System.out.print(currentVertex + " "); // Print the visited vertex

            // Get all adjacent vertices of the dequeued vertex
            for (Integer neighbor : graph.myNetwork[currentVertex]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true; // Mark as visited
                    queue.add(neighbor); // Enqueue the adjacent vertex
                }
            }
        }
    }

    // Depth-First Search
    public static void dfs(NetworkGraph graph, int startVertex) {
        boolean[] visited = new boolean[graph.vertex]; // Track visited vertices
        Stack<Integer> stack = new Stack<>(); // Stack for DFS

        stack.push(startVertex); // Push start vertex onto the stack

        while (!stack.isEmpty()) {
            int currentVertex = stack.pop(); // Pop a vertex from the stack

            if (!visited[currentVertex]) {
                visited[currentVertex] = true; // Mark as visited
                System.out.print(currentVertex + " "); // Print the visited vertex

                // Get all adjacent vertices of the popped vertex
                for (int i = graph.myNetwork[currentVertex].size() - 1; i >= 0; i--) {
                    Integer neighbor = graph.myNetwork[currentVertex].get(i);
                    if (!visited[neighbor]) {
                        stack.push(neighbor); // Push the adjacent vertex onto the stack
                    }
                }
            }
        }
    }
}
