1class Solution {
2    public int[] transformArray(int[] nums) {
3        
4        int j = 0;
5        int n = nums.length;
6        for(int i = 0; i < n; i++) {
7            if(nums[i] % 2 == 0) {
8                nums[j++] = 0;
9            }
10        }
11
12        while(j < n) {
13            nums[j++] = 1;
14        }
15
16        return nums;
17    }
18}