package src.leetCodeProblems.LinkedlListProblems;

public class Problem876_2 {

    public static void main(String[] args) {

        ListNode listNode = new ListNode(11);
        ListNode listNode2 = new ListNode(22);
        ListNode listNode3 = new ListNode(33);
        ListNode listNode4 = new ListNode(44);
        ListNode listNode5 = new ListNode(55);
        ListNode listNode6 = new ListNode(66);
        listNode.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        listNode5.next = listNode6;
        System.out.println(middleNode(listNode).val);
    }

    public static ListNode middleNode(ListNode head) {
        if(head.next == null)
            return head;

        if(head.next.next == null)
            return head.next;

        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
           
        }

        return slow;
    }
}
