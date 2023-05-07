package src.leetCodeProblems.LinkedlListProblems;

public class SampleData {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(11);
        ListNode listNode2 = new ListNode(22);
        ListNode listNode3 = new ListNode(33);
        ListNode listNode4 = new ListNode(44);
        ListNode listNode5 = new ListNode(55);
        listNode.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
    }
}
