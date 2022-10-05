package src.leetCodeProblems.LinkedlListProblems;

public class Problem21 {
    
    public static void main(String[] args) {
        
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        ListNode result = mergeTwoLists(list1, list2);
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

    static public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode result = new ListNode(0);
        ListNode temp = result;

        while(list1 != null && list2!=null) {
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

        return result.next;
    }
}
