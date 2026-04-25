1class Solution {
2    public int search(int[] nums, int target) {
3        
4        int low = 0;
5        int high = nums.length - 1;
6
7        while(low <= high) {
8            int mid = (low + high) / 2;
9
10            if(nums[mid] == target) {
11                return mid;
12            }
13
14            if(target < nums[mid]) {
15                high = mid - 1;
16            } else {
17                low = mid + 1;
18            }
19        }
20
21        return -1;
22    }
23}