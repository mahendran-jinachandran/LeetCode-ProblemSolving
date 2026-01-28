1import java.util.*;
2
3class Solution {
4    public int[] nextLargerNodes(ListNode head) {
5        
6        List<Integer> vals = new ArrayList<>();
7        while (head != null) {
8            vals.add(head.val);
9            head = head.next;
10        }
11
12        int n = vals.size();
13        int[] ans = new int[n];
14        Deque<Integer> st = new ArrayDeque<>(); 
15
16        for (int i = 0; i < n; i++) {
17            int curr = vals.get(i);
18
19            while (!st.isEmpty() && curr > vals.get(st.peek())) {
20                int idx = st.pop();
21                ans[idx] = curr;
22            }
23
24            st.push(i);
25        }
26
27        return ans;
28    }
29}
30