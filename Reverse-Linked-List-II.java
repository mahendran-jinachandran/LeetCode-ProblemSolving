1class Solution {
2    public ListNode reverseBetween(ListNode head, int left, int right) {
3
4        if (head == null || left == right) return head;
5
6        ListNode dummy = new ListNode(0);
7        dummy.next = head;
8
9        ListNode prev = dummy;
10        for (int i = 1; i < left; i++) {
11            prev = prev.next;
12        }
13
14        ListNode curr = prev.next; 
15        for (int i = 0; i < right - left; i++) {
16            ListNode move = curr.next;     
17            curr.next = move.next;       
18            move.next = prev.next; 
19            prev.next = move;
20        }
21
22        return dummy.next;
23    }
24}
25