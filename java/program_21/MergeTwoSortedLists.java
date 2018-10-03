package program_21;

public class MergeTwoSortedLists {
    public MergeTwoSortedLists() {
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(0);
        ListNode l1Node = l1;
        ListNode l2Node = l2;
        ListNode l3Node = l3;

        while(true) {
            if (l1Node == null) {
                l3Node.next = l2Node;
                break;
            }

            if (l2Node == null) {
                l3Node.next = l1Node;
                break;
            }

            if (l1Node.val >= l2Node.val) {
                l3Node.next = new ListNode(l2Node.val);
                l2Node = l2Node.next;
            } else {
                l3Node.next = new ListNode(l1Node.val);
                l1Node = l1Node.next;
            }

            l3Node = l3Node.next;
        }

        return l3.next;
    }
}
