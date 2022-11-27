package src.DSASheetForDataStructures.LinkedList;

import src.DSASheetForDataStructures.LinkedList.CommonNode.Node;

// https://practice.geeksforgeeks.org/problems/sort-a-linked-list/1
// Merge Sort for Linked List
public class Question12 {

    public static void main(String[] args) {
        Node n1 = new Node(6);
        Node n2 = new Node(5);
        Node n3 = new Node(4);
        Node n4 = new Node(3);
        Node n5 = new Node(2);
        Node n6 = new Node(1);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        Node.printLinkedList(n1);
        System.out.println();
        Node.printLinkedList(mergeSort(n1));
    }

    static Node mergeSort(Node head) {

        if (head == null || head.next == null)
            return head;

        Node mid = getMid(head);
        Node left = mergeSort(head);
        Node right = mergeSort(mid);

        return merge(left, right);
    }

    private static Node merge(Node list1, Node list2) {
        Node dummyHead = new Node(0);
        Node tail = dummyHead;
        while (list1 != null && list2 != null) {
            if (list1.value < list2.value) {
                tail.next = list1;
                list1 = list1.next;
                tail = tail.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
                tail = tail.next;
            }
        }
        tail.next = (list1 != null) ? list1 : list2;
        return dummyHead.next;
    }

    private static Node getMid(Node head) {
        Node midPrev = null;
        while (head != null && head.next != null) {
            midPrev = (midPrev == null) ? head : midPrev.next;
            head = head.next.next;
        }
        Node mid = midPrev.next;
        midPrev.next = null;
        return mid;
    }
}
