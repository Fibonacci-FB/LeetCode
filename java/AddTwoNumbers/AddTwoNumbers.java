package AddTwoNumbers;

/**
 * Created by guoxiaopeng on 2017/8/28.
 */
public class AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode l3 = new ListNode(0);
        ListNode pointer1 = l1,pointer2 = l2,pointer3 = l3;
        while (pointer1 != null || pointer2 != null) {

            if (pointer1.val + pointer2.val + pointer3.val >= 10) {
                pointer3.val = pointer1.val + pointer2.val + pointer3.val - 10;
                pointer3.next = new ListNode(1);
            } else {
                pointer3.val = pointer1.val + pointer2.val + pointer3.val;
                pointer3.next = new ListNode(0);
            }

            pointer1 = pointer1.next;
            pointer2 = pointer2.next;
            if (pointer1 == null && pointer2 != null) {
                pointer1 = new ListNode(0);
                pointer3 = pointer3.next;
            } else if (pointer1 != null && pointer2 == null) {
                pointer2 = new ListNode(0);
                pointer3 = pointer3.next;
            } else if (pointer1 != null && pointer2 != null) {
                pointer3 = pointer3.next;
            } else if (pointer3.next.val == 0) {
                pointer3.next = null;
            }
        }
        return l3;
    }
}
