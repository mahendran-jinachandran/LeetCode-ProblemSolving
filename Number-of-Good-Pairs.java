1class Solution {
2    public int numIdenticalPairs(int[] nums) {
3       int freq[]=new int[101];
4        int pair=0;
5        for(int num: nums){
6          pair +=freq[num];
7             
8            freq[num]++;
9        }
10        return pair;
11    }
12}