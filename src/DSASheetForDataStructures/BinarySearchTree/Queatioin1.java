package src.DSASheetForDataStructures.BinarySearchTree;


// Find a value in a BST
public class Queatioin1 {

    public static void main(String[] args) {

        Node root = new Node(15);

        root.left = new Node(5);
        root.right = new Node(20);

        root.left.left = new Node(3);
        root.right.left = new Node(18);
        root.right.left = new Node(80);

        root.right.left.left = new Node(16);

        System.out.println(search(root, 16));

    }

    // recursive approach
    // Time Complexity - O(h), Auxilary Space - O(h) : because of memory in function
    // call stack
    // h = height of tree
    private static boolean search(Node root, int key) {
        if (root == null)
            return false;
        if (root.key == key)
            return true;
        else if (root.key < key)
            return search(root.right, key);
        else
            return search(root.left, key);
    }

    // iterative approach
    private static boolean searchWithIteration(Node root, int key) {

        while (root != null) {
            if (root.key == key)
                return true;
            else if (root.key < key)
                root = root.right;
            else
                root = root.left;
        }
        return false;
    }
}
