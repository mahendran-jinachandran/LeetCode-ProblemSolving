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
14        int n = 0;
15        ListNode curr = head;
16        while(curr != null) {
17            n++;
18            curr = curr.next;
19        }
20
21        curr = head;
22        ListNode firstK = null;
23        ListNode secondK = null;
24        int start = 1;
25        while(curr != null) {
26            if(start == k) {
27                firstK = curr;
28            }
29
30            if(n == k) {
31                secondK = curr;
32            }
33
34            n--;
35            start++;
36            curr = curr.next;
37        }
38
39        int val = firstK.val;
40        firstK.val = secondK.val;
41        secondK.val = val;
42        return head;
43    }
44}