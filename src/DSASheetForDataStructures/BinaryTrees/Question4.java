package src.DSASheetForDataStructures.BinaryTrees;

// Diameter of a tree
// Hint : use (leftHeight + rightHeight + 1) approach 
public class Question4 {

    public static void main(String[] args) {

        Node root = new Node(10);

        // level - 1
        root.left = new Node(8);
        root.right = new Node(30);

        // level - 2
        root.right.left = new Node(40);
        root.right.right = new Node(50);

        System.out.println(diameter(root));
    }

    // naive approach : Time Complexity = O(n^2)
    private static int diameter(Node root) {
        if (root == null)
            return 0;
        int d1 = 1 + height(root.left) + height(root.right);
        int d2 = diameter(root.left);
        int d3 = diameter(root.right);
        return Math.max(d1, Math.max(d2, d3));

    }

    private static int height(Node root) {
        if (root == null) {
            return 0;
        } else {
            return 1 + Math.max(height(root.left), height(root.right));
        }
    }

}
