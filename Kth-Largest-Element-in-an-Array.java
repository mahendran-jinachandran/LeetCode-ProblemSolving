1class Solution {
2    public int findKthLargest(int[] nums, int k) {
3        
4        PriorityQueue<Integer> queue = new PriorityQueue<>();
5
6        for(int n: nums) {
7
8            queue.add(n);
9            if(queue.size() > k) {
10                queue.remove();
11            }
12        }
13
14        return queue.peek();
15    }
16}