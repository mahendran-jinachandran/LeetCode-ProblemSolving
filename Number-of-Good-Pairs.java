1class Solution {
2    public int numIdenticalPairs(int[] nums) {
3        Map<Integer, Integer> pairs = new HashMap<>();
4        int count = 0;
5
6        for (int i = 0; i < nums.length; i++) {
7            if (pairs.containsKey(nums[i])) {
8                count += pairs.get(nums[i]);
9            }
10            pairs.put(nums[i], pairs.getOrDefault(nums[i], 0) + 1);
11        }
12
13        return count;        
14    }
15}