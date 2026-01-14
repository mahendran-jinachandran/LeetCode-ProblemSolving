1class Solution {
2    public int subarraySum(int[] nums, int k) {
3        Map<Integer, Integer> freq = new HashMap<>();
4        freq.put(0, 1);
5
6        int prefixSum = 0;
7        int count = 0;
8
9        for(int num: nums) {
10            prefixSum += num;
11            count += freq.getOrDefault(prefixSum - k, 0);
12            freq.put(prefixSum, freq.getOrDefault(prefixSum, 0) + 1);
13        }
14
15        return count;
16    }
17}