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
11
12class Solution {
13    public void reorderList(ListNode head) {
14        
15        ListNode slow = head;
16        ListNode fast = head.next;
17
18        while(fast != null && fast.next != null) {
19            slow = slow.next;
20            fast = fast.next.next;
21        }
22
23        ListNode second = slow.next;
24        ListNode prev = slow.next = null;
25        while(second != null) {
26            ListNode temp = second.next;
27            second.next = prev;
28            prev = second;
29            second = temp;
30        }
31
32        ListNode first = head;
33        second = prev;
34        while (second != null) {
35            ListNode tmp1 = first.next;
36            ListNode tmp2 = second.next;
37            first.next = second;
38            second.next = tmp1;
39            first = tmp1;
40            second = tmp2;
41        }
42    }
43}
44