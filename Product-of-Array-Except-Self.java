1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3        
4        int n = nums.length;
5        int[] res = new int[n];
6
7        res[0] = 1;
8
9        for(int i = 1; i < n; i++) {
10            res[i] = res[i - 1] * nums[i - 1];
11        }
12
13        int postfix = 1;
14        for (int i = n - 1; i >= 0; i--) {
15            res[i] *= postfix;
16            postfix *= nums[i];
17        }
18
19        return res;
20    }
21}