package assign6.src;

class Country {
    String name;
    int pop;

    public Country(String name, int pop) {
        this.name = name;
        this.pop = pop;
    }

    public String toString() {
        return name + " (" + pop + ")";
    }

}

class CNode {
    Country val;
    CNode left, right;

    public CNode(Country val) {
        this.val = val;
    }

}

public class AS6Q4 {
    CNode root;

    public void insert(Country c) {
        root = insert(c, root);

    }

    private CNode insert(Country c, CNode node) {
        if (node == null) {
            node = new CNode(c);
        } else if (c.pop < node.val.pop) {
            node.left = insert(c, node.left);
        } else {
            node.right = insert(c, node.right);
        }

        return node;
    }

    public void inOrderTraversal() {
        inOrderTraversal(root);
        System.out.println();
    }

    private void inOrderTraversal(CNode root) {
        if (root == null) {
            return;
        }
        inOrderTraversal(root.left);
        System.out.println(root.val);
        inOrderTraversal(root.right);
    }

    public Country findMin() {
        CNode temp = root;
        while (temp.left != null) {
            temp = temp.left;

        }

        return temp.val;
    }

    public Country findMax() {
        CNode temp = root;
        while (temp.right != null) {
            temp = temp.right;
        }

        return temp.val;
    }

    public static void main(String[] args) {
        AS6Q4 tree = new AS6Q4();
        tree.insert(new Country("India", 1400000000));
        tree.insert(new Country("USA", 331000000));
        tree.insert(new Country("China", 1440000000));
        tree.insert(new Country("Brazil", 213000000));
        tree.insert(new Country("Nigeria", 206000000));

        tree.inOrderTraversal();

        System.out.println("Get Min: " + tree.findMin());
        System.out.println("Get Max: " + tree.findMax());

    }

}