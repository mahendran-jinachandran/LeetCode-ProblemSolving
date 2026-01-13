1class Solution {
2    public int numSubarrayProductLessThanK(int[] nums, int k) {
3
4         if (k <= 1) return 0;
5        
6        int left = 0;
7        long product = 1;
8        int count = 0;
9
10        for(int right = 0; right < nums.length; right++) {
11            
12            product *= nums[right];
13
14            while(product >= k) {
15                product /= nums[left];
16                left++;
17            }
18
19            count += (right - left + 1);
20        }
21
22        return count;
23    }
24}