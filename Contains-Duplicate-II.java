1class Solution {
2    public boolean containsNearbyDuplicate(int[] nums, int k) {
3        HashMap<Integer, Integer> numbers = new HashMap<Integer, Integer>();
4
5        int n = nums.length;
6        boolean containsDuplicate = false;
7        for(int i = 0; i <n; i++ ) {
8
9            if(numbers.containsKey(nums[i])) {
10                if(Math.abs(numbers.get(nums[i]) - i) <= k) {
11                    return true;
12                } else {
13                    numbers.put(nums[i], i);
14                }
15            } else {
16                numbers.put(nums[i], i);
17            }
18        }
19
20        return false;
21    }
22}