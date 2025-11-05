class Solution {
    public int findDuplicate(int[] nums) {
        
        boolean[] numbers = new boolean[nums.length + 1]; 
        for(int n: nums) {
            if(numbers[n] == true) {
                return n;
            }

            numbers[n] = true;
        }

        return -1;
    }
}