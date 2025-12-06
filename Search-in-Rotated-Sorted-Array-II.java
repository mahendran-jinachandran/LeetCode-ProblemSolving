1class Solution {
2    public boolean search(int[] nums, int target) {
3        
4        int low = 0;
5        int high = nums.length - 1;
6
7        while(low <= high) {
8            int mid = (low + high) / 2;
9
10            if(nums[mid] == target) {
11                return true;
12            }
13
14            if (nums[low] == nums[mid] && nums[mid] == nums[high]) {
15                low++;
16                high--;
17                continue;
18            }
19
20            if(nums[low] <= nums[mid]) {
21
22                if(target < nums[mid] && target >= nums[low]) {
23                    high = mid - 1;
24                } else {
25                    low = mid + 1;
26                }
27
28            } else {
29                if(target > nums[mid] && target <= nums[high]) {
30                    low = mid + 1;
31                } else {
32                    
33                    high = mid - 1;
34                }
35            }
36        }
37
38        return false;
39    }
40}