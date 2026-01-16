1class Solution {
2    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
3    
4        HashMap<Integer, Integer> map = new HashMap<>();
5        Deque<Integer> st = new ArrayDeque<>();
6
7        for(int x: nums2) {
8
9            while(!st.isEmpty() && x > st.peek()) {
10                map.put(st.pop(), x);
11            }
12
13            st.push(x);
14        }
15
16        while(!st.isEmpty()) {
17            map.put(st.pop(), -1);
18        }
19
20        int n = nums1.length;
21        int[] arr = new int[n];
22        for(int i = 0; i < n; i++) {
23            arr[i] = map.get(nums1[i]);
24        } 
25
26        return arr;
27    }
28}