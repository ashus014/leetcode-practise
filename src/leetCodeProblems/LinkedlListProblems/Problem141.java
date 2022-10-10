package src.leetCodeProblems.LinkedlListProblems;

public class Problem141 {
    
    public static void main(String[] args) {
        
    }

    static public boolean hasCycle(ListNode head) {
        
        ListNode oneStepRunner = head;
        ListNode twoStepRunner = head;

        while( twoStepRunner != null && twoStepRunner.next != null) {

            oneStepRunner = oneStepRunner.next;
            twoStepRunner = twoStepRunner.next.next;

            if(oneStepRunner == twoStepRunner ) {
                return true;
            }
        }

        return false;
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
