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

    int calculateGCD(int a, int b) {
        if(b == 0) {
            return a;
        }

        return calculateGCD(b, a % b);
    }

    public ListNode insertGreatestCommonDivisors(ListNode head) {
        
        if (head.next == null) return head;

        ListNode temp = head;
        while(temp.next != null) {
            ListNode prev = temp.next;
            int highestDivisor = calculateGCD(temp.val, temp.next.val);
            temp.next = new ListNode(highestDivisor, prev);
            temp = temp.next.next;
        }

        return head;
    }
}