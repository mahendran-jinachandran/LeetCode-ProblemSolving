1class Solution {
2    public int minimumCost(int[] nums) {
3        
4        int nums1 = 51;
5        int nums2 = 51;
6
7        int n = nums.length;
8        for(int i = 1; i < n; i++) {
9            if(nums[i] < nums1) {
10                nums2 = nums1;
11                nums1 = nums[i];
12            } else if (nums[i] < nums2){
13                nums2 = nums[i];
14            }
15        }
16
17
18        return nums[0] + nums1 + nums2;
19    }
20}