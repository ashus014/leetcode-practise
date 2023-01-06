package src.DSASheetForDataStructures.BinarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

// Deletion in BST
// 1. No issue with deltion if the node is a leaf node.
// 2. if the node has only one child, then it takes the deleted node place.
// 3. if the node has both child, then the deleted node needs to be replaced with...
// the closest value, could be closest lower value or higher value...
// both the options is fine.
// Hint : You can make a rule and always perform the same, pick closest greater value.
public class Question2 {

    public static void main(String[] args) {
        Node root = new Node(50);

        root.left = new Node(30);
        root.right = new Node(70);

        root.left.left = new Node(10);
        root.left.right = new Node(40);
        root.right.left = new Node(60);
        root.right.right = new Node(80);

        delNode(root, 70);
        printLevel(root);
    }

    // printing tree using BFS traversal
    private static void printLevel(Node root) {

        if (root == null)
            return;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node curr = q.poll();
            System.out.print(curr.key + " -> ");
            if (curr.left != null)
                q.add(curr.left);
            if (curr.right != null)
                q.add(curr.right);
        }
    }

    private static Node delNode(Node root, int x) {
        if (root == null)
            return null;
        if (root.key > x) {
            root.left = delNode(root.left, x);
        } else if (root.key < x) {
            root.right = delNode(root.right, x);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                Node successor = getSuccessor(root);
                root.key = successor.key;
                root.right = delNode(root.right, successor.key);
            }
        }
        return root;
    }

    // successor code is not the optimal code
    // this only works in third case of delete...
    // not a generic function that works anywhere.
    private static Node getSuccessor(Node root) {
        Node curr = root.right;
        while (curr != null && curr.left != null) {
            curr = curr.left;
        }
        return curr;
    }
}
