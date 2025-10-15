class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> counter = new HashSet<Integer>();
        for(int i: nums) {
            if(counter.contains(i)) {
                return true;
            }

            counter.add(i);
        }

        return false;
    }
}