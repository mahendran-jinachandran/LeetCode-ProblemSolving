1class Solution {
2    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
3        
4        int count = 0;
5        int n = hours.length;
6        for(int i = 0; i < n; i++) {
7            if(hours[i] >= target) {
8                count++;
9            }
10        }
11
12        return count;
13    }
14}