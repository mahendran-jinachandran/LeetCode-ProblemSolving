1class Solution {
2    public void sortColors(int[] nums) {
3        
4        int low = 0;
5        int mid = 0;
6        int high = nums.length - 1;
7
8        while(mid <= high) {
9            if(nums[mid] == 0) {
10                int temp = nums[low];
11                nums[low] = nums[mid];
12                nums[mid] = temp;
13                low++;
14                mid++;
15            } else if(nums[mid] == 1) {
16                mid++;
17            } else {
18                int temp = nums[high];
19                nums[high] = nums[mid];
20                nums[mid] = temp;
21                high--;
22            }
23        }
24    }
25}