package assign6.src;

class BST {

    Node root;

    public void createTree(int[] arr) {
        root = createTree(arr, 0, arr.length - 1);
    }

    private Node createTree(int[] arr, int start, int end) {
        if (start > end)
            return null;

        int mid = (start + end) / 2;

        Node newNode = new Node(arr[mid]);
        newNode.left = createTree(arr, start, mid - 1);
        newNode.right = createTree(arr, mid + 1, end);
        return newNode;

    }

    public void inOrderTraversal() {
        inOrderTraversal(root);
        System.out.println();
    }

    private void inOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.val + " ");
        inOrderTraversal(root.right);
    }

}

public class AS6Q2 {
    public static void main(String[] args) {
        BST bst = new BST();
        int[] arr = { 10, 20, 30, 50, 60, 70, 80, 90, 100 };
        bst.createTree(arr);

        bst.inOrderTraversal();

    }

}
