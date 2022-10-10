package src.leetCodeProblems.LinkedlListProblems;

public class Problem142 {
    
    public static void main(String[] args) {


    }

    public ListNode detectCycle(ListNode head) {
        int length = 0;

        ListNode oneStepRunner = head;
        ListNode twoStepRunner = head;

        while( twoStepRunner != null && twoStepRunner.next != null) {

            oneStepRunner = oneStepRunner.next;
            twoStepRunner = twoStepRunner.next.next;

            if(oneStepRunner == twoStepRunner ) {
                length = lengthOfCycle(oneStepRunner);
                break;
            }
        }

        if(length == 0) {
            return null;
        }

        // find the start node
        ListNode first = head;
        ListNode second = head;

        while(length > 0) {
            second = second.next;
            length--;
        }

        // keep moving both forward and they'll meet at cycle start
        while( first!= second) {
            first = first.next;
            second = second.next;
        }

        return second;

    }

    static public int lengthOfCycle(ListNode head) {
    
        ListNode oneStepRunner = head;
        ListNode twoStepRunner = head;

        while( twoStepRunner != null && twoStepRunner.next != null) {

            oneStepRunner = oneStepRunner.next;
            twoStepRunner = twoStepRunner.next.next;

            if(oneStepRunner == twoStepRunner ) {
                ListNode temp = oneStepRunner;
                int length = 0;
                do {
                    temp = temp.next;
                    length++;
                } while(temp != oneStepRunner);
                return length;
            }
        }
        return 0;
    }
}
