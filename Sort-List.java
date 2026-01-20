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
12    public ListNode sortList(ListNode head) {
13
14        if(head == null || head.next == null) {
15            return head;
16        }
17
18        ListNode prev = null, slow = head, fast = head;
19        while(fast != null && fast.next != null) {
20            prev = slow;
21            slow = slow.next;
22            fast = fast.next.next;
23        }
24
25        prev.next = null;
26
27        ListNode l1 = sortList(head);
28        ListNode l2 = sortList(slow);
29        return merge(l1, l2);
30    }
31
32    private ListNode merge(ListNode l1, ListNode l2) {
33
34        ListNode dummy = new ListNode(0);
35        ListNode head = dummy;
36
37        while(l1 != null && l2 != null) {
38            if(l1.val <= l2.val) {
39                dummy.next = l1;
40                l1 = l1.next;
41            } else {
42                dummy.next = l2;
43                l2 = l2.next;
44            }
45
46            dummy = dummy.next;
47        }
48
49        dummy.next = (l1 != null) ? l1 : l2;
50        return head.next;
51    }
52}