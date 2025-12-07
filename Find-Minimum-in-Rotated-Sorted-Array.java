1class Solution {
2    public int findMin(int[] nums) {
3        
4        int low = 0;
5        int high = nums.length - 1;
6        while(low < high) {
7            int mid = low + (high - low) / 2;
8
9            if (nums[mid] > nums[high]) {
10
11                low = mid + 1;
12            } else {
13
14                high = mid;
15            }
16        }
17
18        return nums[low];
19    }
20}