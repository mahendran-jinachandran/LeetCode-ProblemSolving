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
13    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
14        
15        ListNode head = null;
16        ListNode temp = null;
17
18        int sum = 0;
19        int remainder = 0;
20
21        while(true) {
22
23            int value = 0;
24            if(l1 != null) {
25                value += l1.val;
26                l1 = l1.next;
27            }
28
29            if(l2 != null) {
30                value += l2.val;
31                l2 = l2.next;
32            }
33
34            value += remainder;
35            sum = value % 10;
36
37            if(head == null) {
38                head = new ListNode(sum);
39                temp = head;
40            } else {
41                temp.next = new ListNode(sum);
42                temp = temp.next;
43            }
44            
45            remainder = value / 10;
46
47            if(l1 == null && l2 == null) {
48                if(remainder == 0) {
49                    break;
50                }
51            }
52        }
53
54        return head;
55    }
56}
57