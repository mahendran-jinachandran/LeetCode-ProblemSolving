1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode removeNthFromEnd(ListNode head, int n) {
13
14        ListNode fast = head;
15        ListNode slow = head;
16
17        for(int i = 0; i < n; i++) {
18            fast = fast.next;
19        }   
20
21        if(fast == null) {
22            return head.next;
23        }
24
25        while(fast.next != null) {
26            fast = fast.next;
27            slow = slow.next;
28        }
29
30        slow.next = slow.next.next;
31        return head;
32    }
33}