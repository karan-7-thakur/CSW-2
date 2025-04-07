package Trees.src.binarytree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BT {

    private Node2 root;

    public BT() {
    }

    /*
     * Populate Function: Adds element to the tree reccusively
     */
    public void populate(Scanner sc) {
        System.out.print("Enter the Root Node: ");
        root = new Node2(sc.nextInt());
        populate(sc, root);

    }

    private void populate(Scanner sc, Node2 temp) {

        System.out.print("Does it have L " + temp.val + " :");
        char chkL = sc.next().charAt(0);

        if (chkL == 'Y' || chkL == 'y') {
            System.out.print("Enter the Value L of" + temp.val + " : ");
            temp.left = new Node2(sc.nextInt());
            populate(sc, temp.left);
        }

        System.out.print("Does it have R " + temp.val + " :");
        char chkR = sc.next().charAt(0);
        if (chkR == 'Y' || chkR == 'y') {
            System.out.print("Enter the Value R of" + temp.val + " : ");
            temp.right = new Node2(sc.nextInt());
            populate(sc, temp.right);
        }

    }

    /*
     * Print: displays the tree in a level manner
     */
    public void print() {
        if (root != null) {
            print(root, "");
        }

    }

    private void print(Node2 temp, String indent) {
        if (temp == null) {
            return;
        }

        System.out.println(indent + temp.val);
        print(temp.left, indent + "--");
        print(temp.right, indent + "--");
    }

    public void prettyPrint() {
        if (root != null) {
            prettyPrint(root, 0);
        }
    }

    private void prettyPrint(Node2 temp, int level) {
        if (temp == null) {
            return;

        }

        // right most node
        prettyPrint(temp.right, level + 1);

        if (level != 0) {
            // Not root
            System.out.print(" ".repeat(level));

            System.out.println("-->" + temp.val);
        } else {
            System.out.println(temp.val);
        }

        // left Node
        prettyPrint(temp.left, level + 1);
    }

    public boolean find(int val) {
        boolean result = false;
        Node2 temp = root;
        while (temp != null) {
            if (temp.val == val) {
                result = true;
                break;
            }
            if (temp.val > val) {
                temp = temp.left;

            } else if (temp.val < val) {
                temp = temp.right;
            }

        }

        return result;

    }

    /*
     * BFS traversal: queue
     */
    public void printLevel() {
        // Level-order or BFS

        if (root == null) {
            return;
        }

        Queue<Node2> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node2 node = queue.poll();
            System.out.print(node.val + " ");

            // add left and right child
            if (node.left != null) {
                queue.offer(node.left);
            }

            if (node.right != null) {
                queue.offer(node.right);

            }
        }

    }

    public static void main(String[] args) {
        BT tree = new BT();
        tree.populate(new Scanner(System.in));
        tree.print();
        System.out.println("\n\n");
        tree.prettyPrint();
        System.out.println();
        tree.printLevel();

        System.out.println("Find -1: " + tree.find(-1));
        System.out.println("Find 1: " + tree.find(1));

    }

}
