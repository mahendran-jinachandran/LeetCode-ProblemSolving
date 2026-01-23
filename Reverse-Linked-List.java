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
12    
13    public ListNode reverseList(ListNode head) {
14        ListNode node = null;
15
16        while (head != null) {
17            ListNode temp = head.next;
18            head.next = node;
19            node = head;
20            head = temp;
21        }
22
23        return node;        
24    }
25}