package src.DSASheetForDataStructures.BinaryTrees;

// Height of a tree
// https://practice.geeksforgeeks.org/problems/height-of-binary-tree/1
public class Question3 {

    public static void main(String[] args) {

        Node root = new Node(10);

        // level - 1
        root.left = new Node(8);
        root.right = new Node(30);

        // level - 2
        root.right.left = new Node(40);
        root.right.right = new Node(50);

        System.out.println(printHeight(root));
    }

    private static int printHeight(Node root) {
        if (root == null) {
            return 0;
        } else {
            return Math.max(printHeight(root.left), printHeight(root.right)) + 1;
        }
    }
}
