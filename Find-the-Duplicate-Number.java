1class Solution {
2    public int findDuplicate(int[] nums) {
3        
4        boolean[] result = new boolean[nums.length + 1];
5
6        for(int n: nums) {
7            if(result[n] == true) {
8                return n;
9            }
10
11            result[n] = true;
12        }
13
14        return -1;
15    }
16}