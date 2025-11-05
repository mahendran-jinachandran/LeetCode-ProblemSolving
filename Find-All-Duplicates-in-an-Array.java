class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        List<Integer> duplicates = new ArrayList<Integer>();
        boolean[] numbers = new boolean[nums.length + 1];
        for(int n: nums){
            if(numbers[n] == true) {
                duplicates.add(n);
                continue;
            }

            numbers[n] = true;
        }

        return duplicates;
    }
}