1class Solution {
2
3    public int firstOccurence(int[] nums, int target) {
4
5        int low = 0;
6        int high = nums.length - 1;
7        int ans = -1;
8        while(low <= high) {
9            int mid = (low + high) / 2;
10
11            if(nums[mid] == target) {
12                ans = mid;
13                high = mid - 1;
14            } else if (nums[mid] > target) {
15                high = mid - 1;
16            } else {
17                low = mid + 1;
18            }
19        }
20
21        return ans;
22    }
23
24        public int lastOccurence(int[] nums, int target) {
25
26        int low = 0;
27        int high = nums.length - 1;
28        int ans = -1;
29        while(low <= high) {
30            int mid = (low + high) / 2;
31
32            if(nums[mid] == target) {
33                ans = mid;
34                low = mid + 1;
35            } else if (nums[mid] > target) {
36                high = mid - 1;
37            } else {
38                low = mid + 1;
39            }
40        }
41
42        return ans;
43    }
44    
45    public int[] searchRange(int[] nums, int target) {
46        
47        int[] values = new int[2];
48
49        values[0] = firstOccurence(nums, target);
50        values[1] = lastOccurence(nums, target);
51
52        return values;
53    }
54}