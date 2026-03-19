1class Solution {
2    public int[] shuffle(int[] nums, int n) {
3
4        int[] arr = new int[2 * n];
5        int i = 0;
6        int j = n;
7        int size = nums.length;
8        int k = 0;
9        while(j < size) {
10            arr[k++] = nums[i++];
11            arr[k++] = nums[j++];
12        }
13
14        return arr;
15    }
16}