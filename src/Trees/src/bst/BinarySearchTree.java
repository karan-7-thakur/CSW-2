package Trees.src.bst;

// This a BST implementation
class Node {
    int val;
    Node left, right;

    public Node(int val) {
        this.val = val;
    }

    public void add(int val) {
        Node temp = this;

        while (true) {
            if (val < temp.val) {
                // Left Child
                if (temp.left == null) { // Insert Here as no ch
                    temp.left = new Node(val);
                    break;
                }
                temp = temp.left; // Move to the left child

            } else {
                // Right Child
                if (temp.right == null) { // insert here empty space
                    temp.right = new Node(val);
                    break;
                }
                temp = temp.right; // Move to the right child
            }
        }
    }

    // LRN
    public void printInorder() {
        if (this.left != null) {
            this.left.printInorder(); // Recur to left subtree
        }

        System.out.print(this.val + " "); // Print root node value

        if (this.right != null) {
            this.right.printInorder(); // Recur to right subtree
        }
    }

    public boolean find(int val) {

        // root node
        Node temp = this;

        while (temp != null) {

            if (temp.val == val) {
                return true;

            } else if (temp.val < val) {
                temp = temp.right;
            } else {
                temp = temp.left;
            }
        }
        return false;

    }

    /*
     * getMin(): return the min element from the left most node.
     * Iterate till the left most child
     */
    public int getMin() {

        Node temp = this;
        while (temp.left != null) {
            temp = temp.left;
        }

        return temp.val;
    }

    public void delete(int val) {

    }

}

public class BinarySearchTree {
    public static void main(String[] args) {
        Node bst = new Node(13);
        bst.add(3); // Adding 20 to the tree
        bst.add(4); // Adding 5 to the tree
        bst.add(12);
        bst.add(14);
        bst.add(10);
        bst.add(5);
        bst.add(1);
        bst.add(8);
        bst.add(2);
        bst.add(7);
        bst.add(9);
        bst.add(11);
        bst.add(6);
        bst.add(18);

        // Print the tree in-order (sorted order)
        bst.printInorder();
        System.out.println();

        // Search
        System.out.println("Found - 1: " + bst.find(-1));

        // getMin
        System.out.println("Minimum value: " + bst.getMin());
    }
}
