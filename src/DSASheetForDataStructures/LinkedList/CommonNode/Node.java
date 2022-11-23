package src.DSASheetForDataStructures.LinkedList.CommonNode;

public class Node {
    public int value;
    public Node next;

    public Node(int value) {
        this.value = value;
    }

    public static void printLinkedList(Node node) {
        while (node != null) {
            System.out.print(node.value + " ");
            node = node.next;
        }
    }
}