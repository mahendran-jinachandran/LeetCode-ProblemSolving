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
12    public ListNode reverseKGroup(ListNode head, int k) {
13        
14        if(head == null || k <= 1) {
15            return head;
16        }
17
18        ListNode dummy = new ListNode(0);
19        dummy.next = head;
20
21        ListNode groupPrev = dummy;
22
23        while(true) {
24            ListNode kth = getKth(groupPrev, k);
25            if (kth == null) {
26                break;
27            }
28
29
30            ListNode groupNext = kth.next;
31
32            ListNode prev = groupNext;
33            ListNode curr = groupPrev.next;
34
35            while (curr != groupNext) {
36                ListNode next = curr.next;
37                curr.next = prev;
38                prev = curr;
39                curr = next;
40            }
41
42            ListNode oldGroupStart = groupPrev.next; 
43            groupPrev.next = kth;
44            groupPrev = oldGroupStart;
45        }
46
47        return dummy.next;
48    }
49
50    private ListNode getKth(ListNode start, int k) {
51        while (start != null && k > 0) {
52            start = start.next;
53            k--;
54        }
55        return start;
56    }
57}