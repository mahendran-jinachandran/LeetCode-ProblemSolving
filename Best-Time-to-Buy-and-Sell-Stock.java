class Solution {
    public int maxProfit(int[] prices) {
        
        int min = prices[0];
        int res = 0;
        int n = prices.length;

        for(int i = 1; i < n ; i++) {

            if(prices[i] < min) {
                min = prices[i];
            }

            if(prices[i] - min > res) {
                res = prices[i] - min;
            }
            
        }

        return res;
    }
}