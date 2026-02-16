1class Solution {
2    public int threeSumClosest(int[] nums, int target) {
3        
4        Arrays.sort(nums);
5        int closestSum = nums[0] + nums[1] + nums[2];
6        int n = nums.length;
7        if (n == 3) {
8            return nums[0] + nums[1] + nums[2];
9        }
10
11        for(int i = 0; i < n - 2; i++) {
12
13            int left = i + 1;
14            int right = nums.length - 1;
15
16            while(left < right) {
17                int sum = nums[i] + nums[left] + nums[right];
18                if(Math.abs(sum - target) < Math.abs(closestSum - target)) {
19                    closestSum = sum;
20                } 
21                
22                if(sum < target) {
23                    left++;
24                } else if(sum > target) {
25                    right--;
26                } else {
27                    return sum;
28                }
29            }
30        }
31
32        return closestSum;
33    }
34}