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
12    public ListNode oddEvenList(ListNode head) {
13
14        if(head == null || head.next == null) {
15            return head;
16        }
17
18        ListNode odd = head;
19        ListNode even = head.next;
20
21        ListNode evenHead = even;
22
23        while(even != null && even.next != null) {
24            odd.next = even.next;
25            odd = odd.next;
26
27            even.next = odd.next;
28            even = even.next;
29        }
30
31        odd.next = evenHead;
32        return head;
33    }
34}