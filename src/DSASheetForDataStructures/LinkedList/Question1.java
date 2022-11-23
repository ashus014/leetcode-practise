package src.DSASheetForDataStructures.LinkedList;

import src.DSASheetForDataStructures.LinkedList.CommonNode.Node;

// https://practice.geeksforgeeks.org/problems/reverse-a-linked-list/1
// Write a Program to reverse the Linked List. (Both Iterative and recursive)
public class Question1 {

    public static void main(String[] args) {
        Node n1 = new Node(11);
        Node n2 = new Node(22);
        Node n3 = new Node(33);
        Node n4 = new Node(44);
        Node n5 = new Node(55);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        Node.printLinkedList(n1);
        System.out.println();
        // Node.printLinkedList(reverseList(n1));
        Node.printLinkedList(reverseListWithRecursion(n1));
    }

    // Iterative Approach
    static Node reverseList(Node head) {
        Node previous = null;
        Node current = head;
        while (current != null) {
            Node temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
        }
        return previous;
    }

    // Recursive Approach
    static Node reverseListWithRecursion(Node head) {

        if (head == null || head.next == null) {
            return head;
        }

        Node newhead = reverseListWithRecursion(head.next);
        Node headNext = head.next;
        headNext.next = head;
        head.next = null;
        return newhead;
    }
}
