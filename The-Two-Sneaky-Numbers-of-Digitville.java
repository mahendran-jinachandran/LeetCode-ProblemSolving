1class Solution {
2    public int[] getSneakyNumbers(int[] nums) {
3        int n = nums.length;
4        boolean[] a = new boolean[n];
5        int[] ar = new int[2];
6        int k = 0;
7        for(int i = 0;i<n;i++){
8            if(a[nums[i]]==true) ar[k++] = nums[i];
9            else a[nums[i]] = true;
10        }
11        return ar;
12    }
13}