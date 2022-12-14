/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        ListNode ptr = head;

        while (ptr != null) {
            count++;
            ptr = ptr.next;
        }

        int run = count - n;

        if (run == 0) {
            return head.next;
        }

        ptr = head;

        while (run > 1) {
            run--;
            ptr = ptr.next;
        }

        ptr.next = ptr.next.next;

        return head;
    }
}