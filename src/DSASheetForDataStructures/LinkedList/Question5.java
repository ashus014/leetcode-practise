package src.DSASheetForDataStructures.LinkedList;

import src.DSASheetForDataStructures.LinkedList.CommonNode.Node;

// Find the starting point of the loop
// 
public class Question5 {

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
        n8.next = n5;
        System.out.println(startPoint(n1).value);
    }

    static Node startPoint(Node head) {

        if (detectLoop(head)) {
            int lengthOfLoop = findLengthOfLoop(head);
            int temp = 0;
            Node first = head;
            Node second = head;
            while (temp++ < lengthOfLoop) {
                first = first.next;
            }

            while (first != second) {
                first = first.next;
                second = second.next;
            }
            return second;

        } else {
            return null;
        }
    }

    public static int findLengthOfLoop(Node head) {
        int lengthOfLoop = 0;
        Node oneStep = head;
        Node twoStep = head;
        while (twoStep != null && twoStep.next != null) {
            oneStep = oneStep.next;
            twoStep = twoStep.next.next;
            if (oneStep == twoStep) {
                oneStep = oneStep.next;
                lengthOfLoop++;
                while (oneStep != twoStep) {
                    oneStep = oneStep.next;
                    lengthOfLoop++;
                }
                return lengthOfLoop;
            }
        }
        return -1;
    }

    public static boolean detectLoop(Node head) {
        if (head == null || head.next == null)
            return false;
        Node oneStep = head;
        Node twoStep = head;
        while (twoStep != null && twoStep.next != null) {
            oneStep = oneStep.next;
            twoStep = twoStep.next.next;
            if (oneStep == twoStep)
                return true;
        }
        return false;
    }

}
