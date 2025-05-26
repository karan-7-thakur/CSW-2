package Trees.src.bst;

import java.util.Arrays;

public class BSTUsingArray {
    private int[] tree;
    private int capacity;
    private int size=0;

    

    public BSTUsingArray(int capacity) {
        this.capacity = capacity;
        this.tree = new int[capacity];
        // Init the Array to -1 to have empty value
        for (int i = 0; i < capacity; i++) {
            tree[i] = -1;
        }
    }

    /*
     * Simple Add method to add nodes to the array
     */
    public void insertNode(int val){
        insertNode(0, val);
    }

    private void insertNode(int index,int val){
        if (index>=capacity) {
            System.out.println("Tree is Full");
        }else if (tree[index]==-1) {
            tree[index]=val;
            size++;
            // Right Child
        }else if (val>=tree[index]) {
            insertNode(2*index+2, val);
            // Left Child
        }else if (val< tree[index]) {
            insertNode(2*index+1, val);
        }
      
    }

    /*
     * inorder: LNR
     * Reccursive approach
     */
     //Helper Method
     public void inOrderTraversal(){
        inOrderTraversal(0);
     }
    private void inOrderTraversal(int index){
        if (index>=capacity || tree[index]==-1) {
            return;
        }

        // Left Child
        inOrderTraversal(2*index+1);
        // Root
        System.out.println(tree[index]);
        // Right Child
        inOrderTraversal(2*index+2);

    }

    /*
     * PostOrder: LRN
     * Reccursive approach
     */
    public void postOrder(){
        postOrder(0);
    }

    private void postOrder(int index){
        if (index>=capacity || tree[index]==-1) {
            return;
            }

            postOrder(2*index+1);
            postOrder(2*index+2);
            System.out.print(tree[index]+" ");

    }

    /*
     * Find: checks whether a element is present in the Tree 
     * returns Ture/False
     */
    public boolean find(int val){
        return find(0, val);
    }

    private boolean find(int index, int val){
        if (index>=capacity||tree[index]==-1) {
            return false;
        }

        if (tree[index]==val) {
            return true;
        }else if (val>=tree[index]) {
            find(2*index+2, val);
        }else{
            find(2*index+1, val);
        }

        return false;
    }




    public static void main(String[] args) {
        BSTUsingArray tree = new BSTUsingArray(20);
        tree.insertNode(4);
        tree.insertNode(2);
        tree.insertNode(6);
        tree.insertNode(1);
        tree.insertNode(3);
        tree.insertNode(5);
        tree.insertNode(7);


        // tree.inOrderTraversal();
       tree.postOrder();
        System.out.println();
        System.out.println( tree.find(2));
        
    }
}
