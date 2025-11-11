class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        
        int[] newArray = new int[nums.length];

        int i = 0;
        for(int n: nums) {
            if(n < pivot) {
                newArray[i++] = n;
            }
        } 

        for(int n: nums) {
            if(n == pivot) {
                newArray[i++] = n;
            }
        } 

        for(int n: nums) {
            if(n > pivot) {
                newArray[i++] = n;
            }
        } 

        return newArray;
    }
}