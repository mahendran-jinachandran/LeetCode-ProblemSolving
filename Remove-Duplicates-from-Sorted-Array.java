1class Solution {
2    public int removeDuplicates(int[] nums) {
3        int n = nums.length;
4
5        if(n == 0) {
6            return 0;
7        }
8        
9        int end = 0;
10        for(int i = 1; i < n; i++) {
11            if(nums[i - 1] != nums[i]) {
12                end++;
13                nums[end] = nums[i];
14            }
15        }
16
17        return end + 1;
18        
19    }
20}