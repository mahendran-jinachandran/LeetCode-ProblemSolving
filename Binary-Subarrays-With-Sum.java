1class Solution {
2    public int numSubarraysWithSum(int[] nums, int goal) {
3        return atMost(nums, goal) - atMost(nums, goal - 1);
4    }
5
6    private int atMost(int[] nums, int S) {
7        if (S < 0) return 0;
8
9        int left = 0;
10        int sum = 0;
11        int count = 0;
12
13        for (int right = 0; right < nums.length; right++) {
14            sum += nums[right];
15
16            while (sum > S) {        
17                sum -= nums[left++];
18            }
19
20            count += (right - left + 1);
21        }
22
23        return count;
24    }
25}
26