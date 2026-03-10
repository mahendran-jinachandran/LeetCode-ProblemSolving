1class Solution {
2    public int[] getConcatenation(int[] nums) {
3        
4        int n = nums.length;
5        int ans[] = new int[n * 2];
6
7        for(int i = 0; i < n; i++) {
8            ans[i] = nums[i];
9            ans[n + i] = nums[i];
10        }
11
12        return ans;
13    }
14}