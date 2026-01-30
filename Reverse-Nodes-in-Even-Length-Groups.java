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
12    public ListNode reverseEvenLengthGroups(ListNode head) {
13
14        if (head.next == null || head.next.next == null) {
15            return head;
16        }
17
18        ListNode node = head;
19        int group = 1;
20
21        while (node != null && node.next != null)  {
22            group++;
23
24            int countNodes = 0;
25            ListNode temp = node.next;
26            while (temp != null && countNodes < group) {
27                temp = temp.next;
28                countNodes++;
29            }
30
31            if (countNodes % 2 != 0) {
32                for (int i = 0; i < countNodes; i++) {
33                    node = node.next;
34                }
35            } else {
36                ListNode curr = node.next, prev = null, next = null;
37                for (int i = 0; i < countNodes; i++) {
38                    next = curr.next;
39                    curr.next = prev;
40                    prev = curr;
41                    curr = next;
42                }
43
44                ListNode tail = node.next;
45                tail.next = curr;
46                node.next = prev;
47                node = tail;
48            }
49
50        }
51
52        return head;
53    }
54}