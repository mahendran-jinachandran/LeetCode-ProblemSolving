class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> numbers = new HashMap<Integer, Integer>();

        int n = nums.length;
        boolean containsDuplicate = false;
        for(int i = 0; i <n; i++ ) {

            if(numbers.containsKey(nums[i])) {
                if(Math.abs(numbers.get(nums[i]) - i) <= k) {
                    return true;
                } else {
                    numbers.put(nums[i], i);
                }
            } else {
                numbers.put(nums[i], i);
            }
        }

        return false;
    }
}