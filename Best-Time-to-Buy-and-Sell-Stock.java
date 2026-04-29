1class Solution {
2    public int maxProfit(int[] prices) {
3        
4        int maximum = 0;
5        int min = prices[0];
6        int n = prices.length;
7
8        for(int i = 1; i < n; i++) {
9            
10            min = Math.min(min, prices[i]);
11            maximum = Math.max(maximum, prices[i] - min);
12        }
13
14        return maximum;
15        
16    }
17}