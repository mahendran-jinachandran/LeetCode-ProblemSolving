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
    public ListNode mergeNodes(ListNode head) {
        ListNode temp = head.next;
        ListNode secondaryTemp = new ListNode(0);
        ListNode secondaryHead = secondaryTemp;

        int sum = 0;
        while(temp != null) {
            if(temp.val == 0) {
                secondaryTemp.next = new ListNode(sum);
                secondaryTemp = secondaryTemp.next;
                sum = 0;
            }

            sum += temp.val;
            temp = temp.next;
        }

        return secondaryHead.next;
    }
}