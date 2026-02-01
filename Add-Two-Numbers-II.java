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
12    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
13        
14        Stack<Integer> s1 = new Stack<Integer>();
15        Stack<Integer> s2 = new Stack<Integer>();
16
17        while(l1 != null) {
18            s1.push(l1.val);
19            l1 = l1.next;
20        }
21
22        while(l2 != null) {
23            s2.push(l2.val);
24            l2 = l2.next;
25        }
26
27        int sum = 0;
28        ListNode list = new ListNode(0);
29        while (!s1.empty() || !s2.empty()) {
30            if (!s1.empty()) sum += s1.pop();
31            if (!s2.empty()) sum += s2.pop();
32            list.val = sum % 10;
33            ListNode head = new ListNode(sum / 10);
34            head.next = list;
35            list = head;
36            sum /= 10;
37        }
38        
39        return list.val == 0 ? list.next : list;
40    }
41}