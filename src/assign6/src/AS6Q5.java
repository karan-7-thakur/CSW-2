package assign6.src;

public class AS6Q5 {
    Node root;

    /*
     * Insert: without return
     */
    public void insert(int val) {
        if (root == null) {
            root = new Node(val);
        } else {
            insert(val, root);
        }
    }

    private void insert(int val, Node node) {

        if (val < node.val) {
            // Left
            if (node.left == null) {
                node.left = new Node(val);
            } else {
                insert(val, node.left);
            }
        }

        else if (val > node.val) {
            // Right
            if (node.right == null) {
                node.right = new Node(val);
            } else {
                insert(val, node.right);
            }
        }
    }

    // Traverse:
    public void print() {
        System.out.println("In order: ");
        printInOrder(root);

    }

    private void printInOrder(Node node) {
        if (node == null) {
            return;
        }

        printInOrder(node.left);
        System.out.print(node.val + " ");
        printInOrder(node.right);
    }

    /*
     * Delete
     */
    public void delete(int val) {
        root = delete(root, val);
    }

    private Node delete(Node node, int val) {
        if (node == null)
            return null;

        if (val < node.val) {
            node.left = delete(node.left, val);
        } else if (val > node.val) {
            node.right = delete(node.right, val);
        } else {
            // Node to delete found

            // Case 0: No children
            if (node.left == null && node.right == null) {
                return null;
            }

            // Case 1: One child
            if (node.left == null)
                return node.right;
            if (node.right == null)
                return node.left;

            // Case 2: Two children
            Node successor = getMin(node.right);
            node.val = successor.val;
            node.right = delete(node.right, successor.val); // Delete the successor
        }

        return node;
    }

    private Node getMin(Node node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    public static void main(String[] args) {

        AS6Q5 tree = new AS6Q5();

        // Insert nodes to build the tree
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);

        System.out.println("Initial tree:");
        tree.print();
        System.out.println();

        // Case 1: Delete a leaf node (no children)
        System.out.println("\nDeleting 20 (leaf node):");
        tree.delete(20);
        tree.print();

        // Case 2: Delete a node with one child
        System.out.println("\nDeleting 30 (one child):");
        tree.delete(30);
        tree.print();

        // Case 3: Delete a node with two children
        System.out.println("\nDeleting 50 (two children):");
        tree.delete(50);
        tree.print();
    }

}
