package src.leetCodeProblems.LinkedlListProblems;

public class Problem19 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode start = new ListNode();
        start.next = head;
        ListNode fast = start;
        ListNode slow = start;

        for(int i  = 0; i<n; i++) {
            fast = fast.next;
        }

        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow = slow.next.next;

        return start.next;

    }
}
