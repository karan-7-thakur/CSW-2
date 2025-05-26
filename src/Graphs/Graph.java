package Graphs;

import java.util.LinkedList;
import java.util.Queue;

public class Graph {
    int vertices;

    int[][] adMatrix;
    LinkedList<Integer>[] adList;

    public Graph(int vertices) {
        this.vertices = vertices;

        adMatrix = new int[vertices][vertices];
        adList = new LinkedList[vertices];

        // Init the List
        for (int i = 0; i < vertices; i++) {
            adList[i] = new LinkedList<Integer>();
        }

    }

    public void insertEdge(int u, int v) {
        if (u >= vertices || v >= vertices) {
            System.out.println("Invalid vertex");
            return;
        }
        // For undirected Graph
        // Edge from u -> v means also an edge from v -> u
        adMatrix[u][v] = 1;
        adMatrix[v][u] = 1;

        adList[u].add(v);
        adList[v].add(u);
    }

    public void display() {
        // Matrix Print
        System.out.println("\nAdjacency Matrix");
        for (int i = 0; i < adMatrix.length; i++) {
            for (int j = 0; j < adMatrix.length; j++) {
                System.out.print(adMatrix[i][j] + " ");
            }
            System.out.println();
        }

        // List Print
        System.out.println("\nAdjacency List");
        for (int i = 0; i < adList.length; i++) {
            System.out.println("Vertex " + i + " : " + adList[i].toString());

        }

    }

    /*
     * BFS TRAVERSAL USING ITERATIVE APPROACH
     * 
     */
    public void BFStraversal(int source) {
        if (source >= vertices) {
            return;

        }
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[vertices];

        visited[source] = true;
        queue.add(source);

        while (!queue.isEmpty()) {
            int u = queue.poll();
            System.out.print(u + " ");

            for (Integer ele : adList[u]) {
                if (!visited[ele]) {
                    visited[ele] = true;
                    queue.offer(ele);
                }

            }

        }
    }

    public static void main(String[] args) {
        Graph g = new Graph(4);
        g.insertEdge(0, 1);
        g.insertEdge(0, 2);
        g.insertEdge(0, 3);
        g.insertEdge(1, 3);
        g.insertEdge(2, 3);

        g.display();
        System.out.print("\nBFS TRAVERSAL: ");
        g.BFStraversal(1);

    }
}
