package src.leetCodeProblems.Problem23;

public class Problem23 {

    public static void main(String[] args) {

        ListNode[] fullList = new ListNode[5];
        ListNode l1 = new ListNode(11);
        l1.next = new ListNode(22);
        l1.next.next = new ListNode(33);
        fullList[0] = l1;
        mergeKLists(fullList);

    }

    public static ListNode mergeKLists(ListNode[] lists) {

        for (ListNode listNode : lists) {
            while (listNode != null) {
                System.out.print(listNode.val + " -> ");
                listNode = listNode.next;
            }
        }
        return null;
    }
}
