package src;

import java.util.ArrayList;
import java.util.List;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Day002 {

    public boolean isPalindrome(ListNode head) {

        List<String> list = new ArrayList<>();
        while (head != null){
            list.add(String.valueOf(head.val));
            head = head.next;
        }

        String[] number = list.toArray(new String[0]);

        for (int i=0; i<number.length; i++) {
            if (!number[i].equals(list.get(number.length-1 -i)))
                return false;
        }
        return true;




        /*StringBuilder numberStringBuilder = new StringBuilder(number);
        String reverseNumber = String.valueOf(numberStringBuilder.reverse());

        if(number.equals(reverseNumber))
            return true;*/
    }

    public static void main(String[] args) {

        ListNode listNode1 = new ListNode(11);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(10);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        Day002 day002 = new Day002();
        System.out.println(day002.isPalindrome(listNode1));
    }
}
