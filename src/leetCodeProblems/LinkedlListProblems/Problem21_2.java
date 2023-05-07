package src.leetCodeProblems.LinkedlListProblems;

public class Problem21_2 {

    public static void main(String[] args) {

        ListNode listNode = new ListNode(11);
        ListNode listNode2 = new ListNode(33);
        ListNode listNode3 = new ListNode(55);
        ListNode listNode4 = new ListNode(77);
        ListNode listNode5 = new ListNode(99);
        listNode.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;

        ListNode listNodeSecond = new ListNode(22);
        ListNode listNodeSecond2 = new ListNode(44);
        ListNode listNodeSecond3 = new ListNode(66);
        listNodeSecond.next = listNodeSecond2;
        listNodeSecond2.next = listNodeSecond3;

        printLinkedList(listNodeSecond);
        ListNode result = mergeTwoLists(listNode, listNodeSecond);
        printLinkedList(result);
    }

    static void printLinkedList(ListNode head) {

        ListNode temp  = new ListNode();
        temp = head;

        while(temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode resultNode = new ListNode(0);
        ListNode temp = resultNode;

        while (list1 != null || list2 != null) {

            if(list1.val <= list2.val) {
                temp.next = list1;
                list1 = list1.next;
            } else {
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }

        if(list1 == null) {
            temp.next = list2;
        } else {
            temp.next = list1;
        }
        return resultNode.next;
    }
}