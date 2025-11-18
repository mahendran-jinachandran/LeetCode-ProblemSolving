class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        for(int num: nums) {
            int index = Math.abs(num) - 1;
            nums[index] = -Math.abs(nums[index]);
        }


        List<Integer> disappearedNumbers = new ArrayList<Integer>();
        int n = nums.length;
        for (int i = 0; i < n; ++i) {
            if (nums[i] > 0) {
                disappearedNumbers.add(i + 1);
            }
        }

        return disappearedNumbers;
    }
}