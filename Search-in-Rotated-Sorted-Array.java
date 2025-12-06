1class Solution {
2    public int search(int[] nums, int target) {
3        
4        int low = 0;
5        int high = nums.length - 1;
6
7        while (low <= high) {
8
9            int mid = (low + high) / 2;
10
11            if (nums[mid] == target)
12                return mid;
13
14            if (nums[low] <= nums[mid]) {
15
16                if (nums[low] <= target && target < nums[mid]) {
17                    high = mid - 1;
18                }
19                else {
20                    low = mid + 1;
21                }
22            }
23
24            else {
25
26                if (nums[mid] < target && target <= nums[high]) {
27                    low = mid + 1;
28                }
29                else {
30                    high = mid - 1;
31                }
32            }
33        }
34
35        return -1;
36
37
38    }
39}