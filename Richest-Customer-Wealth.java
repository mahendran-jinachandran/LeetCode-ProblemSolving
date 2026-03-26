1class Solution {
2    public int maximumWealth(int[][] accounts) {
3        
4        int max = 0;
5        for(int i = 0; i < accounts.length; i++) {
6
7            int total = 0;
8            for(int j = 0; j < accounts[0].length; j++) {
9                total += accounts[i][j];
10            }
11
12            if(total > max) {
13                max = total;
14            }
15        }
16
17        return max;
18    }
19}