package Trees.src.binarytree;

import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left, right;

    Node(int data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;

    }

    Node(int data) {
        // root node
        this.data = data;

    }

    void left(int data) {
        Node temp = new Node(data);
        this.left = temp;
    }

    void right(int data) {
        Node temp = new Node(data);
        this.right = temp;
    }

    static void printInorder(Node root) {

        // In-order: LNR
        if (root == null) {
            return;
        }

        printInorder(root.left);

        System.out.print(root.data + " ");

        printInorder(root.right);

    }

    static void printPreOrder(Node root) {
        // Pre-order: NLR
        if (root == null) {
            return;

        }
        System.out.print(root.data + " ");

        printPreOrder(root.left);

        printPreOrder(root.right);

    }

    static void printPostOrder(Node root) {
        // Post-order: LRN
        if (root == null) {
            return;
        }

        printPostOrder(root.left);
        printPostOrder(root.right);
        System.out.print(root.data + " ");

    }

    static void printLevel(Node root) {
        // Level-order or BFS
        if (root == null) {
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            System.out.print(node.data + " ");

            // add left and right child
            if (node.left != null) {
                queue.offer(node.left);
            }

            if (node.right != null) {
                queue.offer(node.right);

            }

        }

    }

    static int height(Node root) {
        // Height of the tree
        if (root == null) {
            return -1;
        }

        else {
            int leftHeight = height(root.left);
            int rightHeight = height(root.right);

            return Math.max(leftHeight, rightHeight) + 1;

        }
    }

}

public class BinaryTree {
    public static void main(String[] args) {
        Node tree = new Node(10);

        tree.left(20);
        tree.right(30);
        tree.left.left(40);

        tree.right.left(50);
        tree.right.right(60);

        System.out.print("In order: ");
        Node.printInorder(tree);
        System.out.println();

        System.out.print("Pre order: ");
        Node.printPreOrder(tree);
        System.out.println();

        System.out.print("Post order: ");
        Node.printPostOrder(tree);
        System.out.println();

        System.out.print("Level order: ");
        Node.printLevel(tree);
        System.out.println();

        System.out.println("Height: " + Node.height(tree));

    }
}
