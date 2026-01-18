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
12    public ListNode deleteDuplicates(ListNode head) {
13
14        if (head == null || head.next == null) return head;
15        
16        ListNode dummy = new ListNode(0);
17        dummy.next = head;
18
19        ListNode curr = dummy.next;
20        ListNode prev = dummy;
21         
22        while(curr != null) {
23
24            if(curr.next != null && curr.val == curr.next.val) {
25                
26                int dupVal = curr.val;
27
28                while(curr != null && curr.val == dupVal) {
29                    curr = curr.next;
30                }
31
32                prev.next = curr;
33
34            } else {
35                prev = curr;
36                curr = curr.next;
37            }
38        }   
39
40        return dummy.next;
41    }
42}