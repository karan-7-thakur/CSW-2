package assign6.src;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class AS6Q7 {
    int vertices;

    LinkedList<Integer>[] adjLists;

    public AS6Q7(int vertices) {
        this.vertices = vertices;

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

        adjLists[u].add(v);
        adjLists[v].add(u);
    }

    public void display() {
        System.out.println("Adj List\n");
        int i = 0;
        for (LinkedList<Integer> linkedList : adjLists) {
            System.out.print(i + " : ");
            System.out.println(linkedList);
        }
    }

    public void BFStraversal(int source) {

        if (source >= vertices) {
            return;
        }

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(source);

        boolean[] visited = new boolean[vertices];
        visited[source] = true;

        while (!queue.isEmpty()) {
            int u = queue.poll();
            System.out.print(u + " ");

            for (Integer ele : adjLists[u]) {
                if (!visited[ele]) {
                    visited[ele] = true;
                    queue.offer(ele);
                }
            }
        }
    }

    public void DFStraversal(int source) {

        if (source >= vertices) {
            return;
        }

        Stack<Integer> stack = new Stack<>();
        stack.add(source);

        boolean[] visited = new boolean[vertices];
        visited[source] = true;

        while (!stack.isEmpty()) {
            int u = stack.pop();
            System.out.print(u + " ");

            for (Integer ele : adjLists[u]) {
                if (!visited[ele]) {
                    visited[ele] = true;
                    stack.push(ele);
                }
            }
        }
    }

    public static void main(String[] args) {
        AS6Q7 g = new AS6Q7(4);
        g.insertEdge(0, 1);
        g.insertEdge(0, 2);
        g.insertEdge(0, 3);
        g.insertEdge(1, 3);
        g.insertEdge(2, 3);

        g.display();
        System.out.println("Traversal: ");
        g.BFStraversal(0);
        System.out.println();
        g.DFStraversal(0);

    }
}
