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
12    public ListNode swapNodes(ListNode head, int k) {
13        
14        ListNode curr = head;
15        ListNode firstK = null;
16        ListNode secondK = null;
17
18        while(curr != null) {
19            secondK = secondK == null ? null : secondK.next;
20            if(--k == 0) {
21                firstK = curr;
22                secondK = head;
23            }
24
25            curr = curr.next;
26        }
27
28
29        int val = firstK.val;
30        firstK.val = secondK.val;
31        secondK.val = val;
32        return head;
33    }
34}