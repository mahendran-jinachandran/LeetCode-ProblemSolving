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
12    public int numComponents(ListNode head, int[] nums) {
13        Set<Integer> set = new HashSet<Integer>();
14        for(int i: nums) {
15            set.add(i);
16        }
17
18        int count = 0;
19        ListNode curr = head;
20        while(curr != null) {
21
22            if (set.contains(curr.val) && (curr.next == null || !set.contains(curr.next.val))) {
23                count++;
24            }
25            curr = curr.next;
26        }
27
28        return count;
29    }
30}