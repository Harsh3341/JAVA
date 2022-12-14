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
    public ListNode middleNode(ListNode head) {
        ListNode[] A = new ListNode[100];
        int count = 0;
        while (head != null) {
            A[count++] = head;
            head = head.next;
        }

        return A[count / 2];
    }
}

class Solution2 {
    public ListNode middleNode(ListNode head) {
        int count = 0;
        ListNode ptr = head;

        while(ptr != null){
            count++;
            ptr = ptr.next;
        }

        int mid = count/2;
        ptr = head;

        while(mid>0){
            mid--;
            ptr = ptr.next;
        }

        return ptr;
    }
}