package src.DSASheetForDataStructures.BinaryTrees;

public class Question6and7and8 {

    public static void main(String[] args) {

        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);

        System.out.print("Inorder : ");
        inorder(root);
        System.out.println();

        System.out.print("Preorder : ");
        preorder(root);
        System.out.println();

        System.out.print("Postorder : ");
        postorder(root);
    }

    // left -> root -> rigth
    private static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.key + " -> ");
            inorder(root.right);
        }
    }

    // root -> left -> right
    private static void preorder(Node root) {
        if (root != null) {
            System.out.print(root.key + " -> ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    // left -> right -> root
    private static void postorder(Node root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.key + " -> ");
        }
    }
}
