package src.leetCodeProblems.LinkedlListProblems;

public class Problem876 {
    
    public static void main(String[] args) {
        ListNode one = new ListNode(1);
        
        ListNode two = new ListNode(2);
        one.next = two;
        ListNode three = new ListNode(3);
        two.next = three;
        ListNode four = new ListNode(4);
        three.next = four;
        ListNode five = new ListNode(5);
        four.next = five;
        ListNode six = new ListNode(6);
        five.next = six;

        System.out.println(middleNode(one).val);
    }

    static public ListNode middleNode(ListNode head) {
        
        ListNode fast = head;
        ListNode slow = head;

        while( fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
