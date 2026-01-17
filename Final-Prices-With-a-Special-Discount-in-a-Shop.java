1class Solution {
2    public int[] finalPrices(int[] prices) {
3        
4        int n = prices.length;
5        int[] ans = prices.clone();
6        Deque<Integer> nse = new ArrayDeque<>();
7
8        for(int i = 0; i < n; i++) {
9
10            while (!nse.isEmpty() && prices[i] <= prices[nse.peek()]) {
11                int idx = nse.pop();
12                ans[idx] = prices[idx] - prices[i];
13            }
14
15            nse.push(i);
16        }
17
18        return ans;
19    }
20}