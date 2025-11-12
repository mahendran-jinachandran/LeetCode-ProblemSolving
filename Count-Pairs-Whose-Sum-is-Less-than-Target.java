class Solution {
    public int countPairs(List<Integer> nums, int target) {
        
        int[] ans = new int[nums.size()];
        int n = nums.size();
        for(int i = 0; i < n; i++) {
            ans[i] = nums.get(i);
        }

        int count = 0;
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                if(ans[i] + ans[j] < target) {
                    count++;
                }
            }
        }

        return count;
    }
}