package assign6.src;

public class AS6Q3 extends BST {
    // *** Not Working **:
    // It is only comparing the node with the immediate children
    // Have to make it check all the nodes for a range

    // public boolean isBST(){
    // if(root == null) return true;
    // return isBST(root);
    // }

    // private boolean isBST(Node root){
    // if(root == null) return true;
    // int val = root.val;
    // if (root.left!=null && root.left.val< val) {
    // return isBST(root.left);

    // }if (root.right!=null && root.right.val > val) {
    // return isBST(root.right);
    // }else{
    // return false;
    // }

    // }

    public boolean isBST() {
        return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isBST(Node root, int min, int max) {
        if (root == null)
            return true;

        // Not in range
        if (root.val <= min || root.val >= max)
            return false;

        // check for Left and Right Sub tree
        return isBST(root.left, min, root.val) && isBST(root.right, root.val, max);

    }

    public static void main(String[] args) {
        AS6Q3 bst = new AS6Q3();
        int[] arr = { 10, 20, 30, 50, 60, 70, 80, 90, 100 };
        bst.createTree(arr);
        bst.inOrderTraversal();

        //
        System.out.print("Is BST: ");
        System.out.println(bst.isBST());

    }

}
