1class Solution {
2    public int countPartitions(int[] nums) {
3        
4        int n = nums.length;
5        int sum = 0;
6        for(int v: nums) {
7            sum += v;
8        }
9
10        int partitions = 0;
11        int left = 0;
12        for(int i = 0; i < n - 1; i++) {
13            left += nums[i];
14            sum -= nums[i];
15
16            if((left - sum) % 2 == 0) {
17                partitions++;
18            }
19        }
20
21        return partitions;
22    }
23}