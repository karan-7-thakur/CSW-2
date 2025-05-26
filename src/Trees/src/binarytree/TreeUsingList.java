package Trees.src.binarytree;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }

    TreeNode(int x, TreeNode left, TreeNode right) {
        val = x;
        this.left = left;
        this.right = right;
    }
}

public class TreeUsingList {
    TreeNode root = null;

    /*
     * Insert Directly: Here we are directly inserting to the global root
     */
    public void insertNode(int val) {
        if (root == null) {
            root = new TreeNode(val);
        } else {
            insertNode(val, root);
        }
    }

    private void insertNode(int val, TreeNode node) {

        if (val < node.val) {
            if (node.left == null) {
                node.left = new TreeNode(val);
            } else {
                insertNode(val, node.left);
            }
        } else if (val > node.val) {
            if (node.right == null) {
                node.right = new TreeNode(val);
            } else {
                insertNode(val, node.right);
            }
        }
    }

    /*
     * Insert with return: Here we are inserting to a local root and then returing
     * the local root to chnage the global root
     */
    // public void insertNode(int val){
    // root = insertNode(val,root);

    // }
    // private TreeNode insertNode(int val, TreeNode root){
    // if (root==null) {
    // root = new TreeNode(val);
    // }
    // //Left child
    // else if (val < root.val) {
    // root.left = insertNode(val, root.left);
    // }

    // //Right Child
    // else if (val > root.val) {
    // root.right = insertNode(val, root.right);
    // }

    // return root;

    // }

    public void inOrderTraversal() {
        inOrderTraversal(root);
        System.out.println();
    }

    private void inOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.val + " ");
        inOrderTraversal(root.right);
    }

    public boolean find(int val) {
        return find(root, val);
    }

    private boolean find(TreeNode root, int val) {
        if (root == null) {
            return false;
        }
        if (val < root.val) {
            return find(root.left, val);
        } else if (val > root.val) {
            return find(root.right, val);
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        TreeUsingList tree = new TreeUsingList();
        tree.insertNode(4);
        tree.insertNode(2);
        tree.insertNode(6);
        tree.insertNode(1);
        tree.insertNode(3);
        tree.insertNode(5);
        tree.insertNode(7);

        tree.inOrderTraversal();
        System.out.println("Find 5: " + tree.find(5));

    }
}
