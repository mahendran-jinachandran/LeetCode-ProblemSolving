/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {

        if(head == null) {
            return null;
        }
        
        ListNode fast = head;
        ListNode slow = head;

        int len = 1;
        while (fast.next != null) {
            fast = fast.next;
            len += 1;
        }

        fast = head;
        k %= len;
        for(int i=0; i<k; i++) {
            fast = fast.next;

            if(fast == null) {
                fast = head;
            }
        }

        while(fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        fast.next = head;
        head = slow.next;
        slow.next = null;
        
        return head;
    }
}