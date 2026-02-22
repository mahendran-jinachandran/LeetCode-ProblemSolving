1class Solution {
2    public int[] sortArrayByParityII(int[] nums) {
3        
4        int n = nums.length;
5        int odd = 1;
6        int even = 0;
7        int[] res = new int[n];
8
9        for(int i = 0; i < n; i++) {
10            if(nums[i] % 2 == 0) {
11                res[even] = nums[i];
12                even += 2;
13            } else {
14                res[odd] = nums[i];
15                odd += 2;
16            }
17        }
18
19        return res;
20    }
21}