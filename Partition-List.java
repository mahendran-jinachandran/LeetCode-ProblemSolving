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
12    public ListNode partition(ListNode head, int x) {
13        
14        ListNode lessDummy = new ListNode(0);
15        ListNode greaterDummy = new ListNode(0);
16
17        ListNode less = lessDummy;
18        ListNode greater = greaterDummy;
19
20        ListNode curr = head;
21
22        while(curr != null) {
23            if(curr.val < x) {
24                less.next = curr;
25                less = less.next;
26            } else {
27                greater.next = curr;
28                greater = greater.next;
29            }
30
31            curr = curr.next;
32        }
33
34        greater.next = null;
35        less.next = greaterDummy.next;
36        return lessDummy.next;
37    }
38}