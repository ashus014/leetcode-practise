package src.DSASheetForDataStructures.LinkedList;

import src.DSASheetForDataStructures.LinkedList.CommonNode.Node;

// Remove Duplicates in a sorted Linked List
public class Question6 {

    public static void main(String[] args) {

        Node n1 = new Node(2);
        Node n2 = new Node(2);
        Node n3 = new Node(4);
        Node n4 = new Node(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        Node.printLinkedList(n1);
        System.out.println();
        Node.printLinkedList(removeDuplicates(n1));
    }

    private static Node removeDuplicates(Node head) {

        Node next = null;
        Node nextNext = null;
        Node current = head;

        while (current != null && current.next != null) {

            next = head.next;
            nextNext = head.next.next;
            if (current.value == next.value) {
                current.next = nextNext;
            }
            current = current.next;
        }
        return head;
    }
}
