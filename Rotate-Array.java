1class Solution {
2
3    void reverse(int[] nums,int start,int end) {
4        while(start < end) {
5            int temp = nums[start];
6            nums[start] = nums[end];
7            nums[end] = temp;
8            start++;
9            end--;
10        }
11    }
12
13    public void rotate(int[] nums, int k) {
14        
15        int n = nums.length;
16
17        k = k % n;
18        reverse(nums, 0 , n - 1);
19        reverse(nums, 0, k - 1);
20        reverse(nums, k, n - 1);
21
22    }
23}