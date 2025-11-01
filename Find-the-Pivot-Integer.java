class Solution {
    public int pivotInteger(int n) {
        int totalSum = n * (n + 1) / 2;
        
        int currentSum = 0;
        for(int i = 1; i < n + 1; i++) {
            int prefixSum = totalSum - currentSum - i;
            if(prefixSum == currentSum) {
                return i;
            }

            currentSum += i;
        }

        return -1; 
    }
}