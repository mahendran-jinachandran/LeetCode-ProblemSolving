class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        int[] ans = new int[nums1.length];
        Arrays.fill(ans, -1);
        int m = nums1.length;
        int n = nums2.length;

        for(int i = 0; i < m; i++) {

            boolean isReached = false;
            for(int j = 0; j < n ; j++) {

                if(nums1[i] == nums2[j]) {
                    isReached = true;
                }

                if(isReached && nums2[j] > nums1[i]) {
                    ans[i] = nums2[j];
                    break;
                }
            }
        }

        return ans;
    }
}