package src.leetCodeProblems.LinkedlListProblems;


public class Problem2095 {
    
    public static void main(String[] args) {
        
    }

    public ListNode deleteMiddle(ListNode head) {
        
        // use slow variable to move one step
        // use fast  variable to move two steps
        // using baove reach the middle & remove it
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null || fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.val = slow.next.val;
        slow.next = slow.next.next;


        // return head
        return head;
    }

    // comparatively slow [Time Limit exceeded]
    public ListNode deleteMiddle2(ListNode head) {
        
        // find the length 'n' of the LinkedList
        int size = 0;
        ListNode temp = head;
        while(temp != null) {
            size++;
        }

        // traverse till 'n/2' & remove the Node
        int middle = size/2; 
        temp = head;
        for(int i=0; i<=middle; i++) {
            temp = temp.next;
        }
        temp.val = temp.next.val;
        temp.next = temp.next.next;

        //return the head
        return head;
    }
}
