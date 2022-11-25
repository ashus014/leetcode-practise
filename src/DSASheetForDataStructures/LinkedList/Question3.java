package src.DSASheetForDataStructures.LinkedList;

import src.DSASheetForDataStructures.LinkedList.CommonNode.Node;

// Write a program to Detect loop in a linked list
// https://practice.geeksforgeeks.org/problems/detect-loop-in-linked-list/1
public class Question3 {

    public static void main(String[] args) {

        Node n1 = new Node(11);
        Node n2 = new Node(22);
        Node n3 = new Node(33);
        Node n4 = new Node(44);
        Node n5 = new Node(55);
        Node n6 = new Node(66);
        Node n7 = new Node(77);
        Node n8 = new Node(88);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        n7.next = n8;
        // n8.next = n5;
        System.out.println(detectLoop(n1));
    }

    public static boolean detectLoop(Node head) {
        // Add code here

        if (head == null || head.next == null) {
            return false;
        }
        Node temp = head;

        Node oneStep = head;
        Node twoStep = head;
        while (twoStep != null && twoStep.next != null) {

            oneStep = oneStep.next;
            twoStep = twoStep.next.next;

            if (oneStep == twoStep) {
                return true;
            }

        }
        return false;
    }
}
