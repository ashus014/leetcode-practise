package src.DSASheetForDataStructures.BinaryTrees;

// Left View of Binary Tree
// https://practice.geeksforgeeks.org/problems/left-view-of-binary-tree/1

// use pre-order traversal of the tree
public class Question9 {

    static int MAX_LEVEL = 0;

    public static void main(String[] args) {
        Node root = new Node(10);

        // level - 1
        root.left = new Node(8);
        root.right = new Node(30);

        // level - 2
        root.right.left = new Node(40);
        root.right.right = new Node(50);

        printLeftView(root);
    }

    static void printLeftView(Node root) {
        printLeft(root, 1);
    }

    static void printLeft(Node root, int level) {
        if (root == null) {
            return;
        }

        if (MAX_LEVEL < level) {
            System.out.print(root.key + " ");
            MAX_LEVEL = level;
        }
        printLeft(root.left, level + 1);
        printLeft(root.right, level + 1);
    }
}
