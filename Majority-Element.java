class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;
        int n = nums.length - 1;

        for(int num: nums) {
            if(count == 0) {
                candidate = num;
                count = 1;
            } else if(candidate == num) {
                count++;
            } else {
                count--;
            }
        }

        count = 0;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }

        if (count > n / 2) {
            return candidate;
        } else {
            return -1;
        }
    }
}