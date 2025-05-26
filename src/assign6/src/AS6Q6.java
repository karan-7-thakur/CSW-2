package assign6.src;

import java.util.LinkedList;

public class AS6Q6 {

    int vertices;
    int[][] adjMatrix;
    LinkedList<Integer>[] adjLists;

    public AS6Q6(int vertices) {
        this.vertices = vertices;
        adjMatrix = new int[vertices][vertices];
        adjLists = new LinkedList[vertices];

        for (int i = 0; i < adjLists.length; i++) {
            adjLists[i] = new LinkedList<Integer>();
        }

    }

    public void insertEdge(int u, int v) {
        if (v >= vertices || u >= vertices) {
            System.out.println("Invalid Edge");
            return;
        }

        adjMatrix[u][v] = 1;
        adjMatrix[v][u] = 1;

        adjLists[u].add(v);
        adjLists[v].add(u);
    }

    public void display() {
        System.out.println("Adj Matrix\n");
        for (int i = 0; i < adjMatrix.length; i++) {
            for (int j = 0; j < adjMatrix[i].length; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Adj List\n");
        int i = 0;
        for (LinkedList<Integer> linkedList : adjLists) {
            System.out.print(i + " : ");
            System.out.println(linkedList);
        }
    }

    public static void main(String[] args) {
        AS6Q6 g = new AS6Q6(4);
        g.insertEdge(0, 1);
        g.insertEdge(0, 2);
        g.insertEdge(0, 3);
        g.insertEdge(1, 3);
        g.insertEdge(2, 3);

        g.display();

    }
}
