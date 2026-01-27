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
12    public ListNode swapPairs(ListNode head) {
13        
14        ListNode dummy = new ListNode(0, head);
15        ListNode prev = dummy, curr = head;
16
17        while(curr != null && curr.next != null) {
18            ListNode sec = curr.next;
19            ListNode third = curr.next.next;
20            
21            curr.next = third;
22            sec.next = curr;
23            prev.next = sec;
24
25            prev = curr;
26            curr = third;
27            
28        } 
29
30        return dummy.next;
31    }
32}