1/**
2 * Definition for singly-linked list.
3 * class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12public class Solution {
13    public ListNode detectCycle(ListNode head) {
14        
15        if(head == null || head.next == null) {
16            return null;
17        }
18
19        ListNode slow = head;
20        ListNode fast = head;
21
22        while(fast != null && fast.next != null) {
23
24            slow = slow.next;
25            fast = fast.next.next;
26
27            if(slow == fast) {
28                ListNode ptr = head;
29
30                while (ptr != slow) {
31                    ptr = ptr.next;
32                    slow = slow.next;
33                }
34
35                return ptr;
36            }
37        }
38
39        return null;
40    }
41}