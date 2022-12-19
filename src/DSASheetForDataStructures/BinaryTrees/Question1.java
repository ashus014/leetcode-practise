package src.DSASheetForDataStructures.BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

// Level Order Traversal or BFS
// Recursive approach is mostly inefficeint here, 
// because we can't switch between left and right side.
// Hint - Use Queue data structure.
public class Question1 {

    public static void main(String[] args) {

        Node root = new Node(10);
        root.left = new Node(15);
        root.left.left = new Node(30);
        root.right = new Node(20);
        root.right.left = new Node(40);
        root.right.left.left = new Node(60);
        root.right.left.right = new Node(70);
        root.right.right = new Node(50);

        printLevel(root);

    }

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
}
