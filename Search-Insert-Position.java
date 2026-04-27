1class Solution {
2    public int searchInsert(int[] nums, int target) {
3
4        int left = 0;
5        int right = nums.length - 1;
6
7        while(left <= right) {
8            int mid = (left + right) / 2;
9
10            if(nums[mid] == target) {
11                return mid;
12            } else if (nums[mid] > target) {
13                right = mid - 1;
14            } else {
15                left = mid + 1;
16            }
17        }
18
19        return left;
20    }
21}