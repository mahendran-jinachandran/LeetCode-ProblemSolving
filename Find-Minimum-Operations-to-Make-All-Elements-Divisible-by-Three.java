1class Solution {
2    public int minimumOperations(int[] nums) {
3        
4        int count = 0;
5        for(int num: nums) {
6            if(num % 3 != 0) {
7                count++;
8            }
9        }
10
11        return count;
12    }
13}