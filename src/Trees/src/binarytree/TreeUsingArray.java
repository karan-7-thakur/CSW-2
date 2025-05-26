package Trees.src.binarytree;

import java.util.Arrays;

public class TreeUsingArray {
    private int[] tree;
    private int capacity;
    private int size = 0;

    public TreeUsingArray(int capacity) {
        this.capacity = capacity;
        this.tree = new int[capacity];
    }

    /*
     * Simple Add method to add nodes to the array
     */
    public void insertNode(int val) {
        if (size >= capacity) {
            System.out.println("Tree is Full");
        } else {
            tree[size++] = val;
        }
    }

    /*
     * inorder: LNR
     * Reccursive approach
     */

    // Helper Method
    public void inOrderTraversal() {
        inOrderTraversal(0);
        System.out.println(Arrays.toString(tree));
    }

    private void inOrderTraversal(int index) {
        if (index > size) {
            return;
        }

        // Left Child
        inOrderTraversal(2 * index + 1);
        // Root
        System.out.println(tree[index]);
        // Right Child
        inOrderTraversal(2 * index + 2);

    }

    public static void main(String[] args) {
        TreeUsingArray tree = new TreeUsingArray(10);
        tree.insertNode(10);
        tree.insertNode(9);
        tree.insertNode(14);
        tree.insertNode(8);
        tree.insertNode(11);

        tree.inOrderTraversal();

    }
}
