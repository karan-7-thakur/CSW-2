package assign6.src;

public class AS6Q1 {

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
        System.out.println("Pre Order: ");
        printPreOrder(root);
        System.out.println();
        System.out.println("In order: ");
        printInOrder(root);
        System.out.println();
        System.out.println("Post Order: ");
        printPostOrder(root);

    }

    private void printInOrder(Node node) {
        if (node == null) {
            return;
        }

        printInOrder(node.left);
        System.out.print(node.val + " ");
        printInOrder(node.right);
    }

    private void printPostOrder(Node node) {
        if (node == null) {
            return;
        }

        printPostOrder(node.left);
        printPostOrder(node.right);
        System.out.print(node.val + " ");
    }

    private void printPreOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.val + " ");
        printPreOrder(node.left);
        printPreOrder(node.right);

    }

    public static void main(String[] args) {

        AS6Q1 tree = new AS6Q1();
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);

        tree.print();
    }
}
