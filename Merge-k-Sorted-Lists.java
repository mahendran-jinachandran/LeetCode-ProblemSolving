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
13    private ListNode mergeTwoNodes(ListNode a, ListNode b) {
14        ListNode dummy = new ListNode(0);
15        ListNode tail = dummy;
16
17        while(a != null && b != null) {
18            
19            if(a.val < b.val) {
20                tail.next = a;
21                a = a.next;
22            } else {
23                tail.next = b;
24                b = b.next;
25            }
26
27            tail = tail.next;
28        }
29
30        tail.next = (a != null) ? a : b;
31        return dummy.next;
32    }
33
34    public ListNode mergeKLists(ListNode[] lists) {
35        
36        if (lists == null || lists.length == 0) return null;
37
38        int interval = 1;
39        while (interval < lists.length) {
40            for (int i = 0; i + interval < lists.length; i += interval * 2) {
41                lists[i] = mergeTwoNodes(lists[i], lists[i + interval]);
42            }
43            interval *= 2;
44        }
45
46        return lists[0];
47    }
48}