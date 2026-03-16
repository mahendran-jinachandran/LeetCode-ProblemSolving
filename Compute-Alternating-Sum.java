1class Solution {
2    public int alternatingSum(int[] nums) {
3        
4        int n = nums.length;
5        int sum = 0;
6        for(int i = 0; i < n; i++) {
7            if(i % 2 == 0) {
8                sum += nums[i];
9            } else {
10                sum -= nums[i];
11            }
12        }
13
14        return sum;
15    }
16}