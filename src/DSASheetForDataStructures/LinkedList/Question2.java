package src.DSASheetForDataStructures.LinkedList;

import src.DSASheetForDataStructures.LinkedList.CommonNode.Node;

public class Question2 {

    public static void main(String[] args) {

        Node n1 = new Node(11);
        Node n2 = new Node(22);
        Node n3 = new Node(33);
        Node n4 = new Node(44);
        Node n5 = new Node(55);
        Node n6 = new Node(66);
        Node n7 = new Node(77);
        Node n8 = new Node(88);
        Node n9 = new Node(99);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        n7.next = n8;
        n8.next = n9;
        Node.printLinkedList(n1);
        System.out.println();
        // Node.printLinkedList(reverseList(n1));
        Node.printLinkedList(reverse(n1, 5));
    }

    public static Node reverse(Node head, int k) {
        // Your code here

        if (head == null) {
            return head;
        }

        Node previous = null;
        Node next = null;
        Node current = head;
        int count = 0;

        while (current != null && count++ < k) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        if (next != null) {
            head.next = reverse(next, k);
        }

        return previous;
    }
}
