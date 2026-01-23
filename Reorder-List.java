1class Solution {
2
3    private ListNode reverseList(ListNode head) {
4        ListNode prev = null;
5        ListNode curr = head;
6
7        while (curr != null) {
8            ListNode next = curr.next;
9            curr.next = prev;
10            prev = curr;
11            curr = next;
12        }
13        return prev;
14    }
15
16    public void reorderList(ListNode head) {
17        if (head == null || head.next == null) return;
18
19        ListNode slow = head, fast = head;
20        while (fast != null && fast.next != null) {
21            slow = slow.next;
22            fast = fast.next.next;
23        }
24
25        ListNode second = slow.next;
26        slow.next = null;
27        ListNode node = reverseList(second);
28
29        ListNode first = head;
30        second = node;
31
32        while (second != null) {
33            ListNode temp1 = first.next;
34            ListNode temp2 = second.next;
35
36            first.next = second;
37            second.next = temp1;
38
39            first = temp1;
40            second = temp2;
41        }        
42    }
43}