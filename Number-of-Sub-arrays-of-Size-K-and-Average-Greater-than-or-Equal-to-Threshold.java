1class Solution {
2    public int numOfSubarrays(int[] arr, int k, int threshold) {
3        
4        long sum = 0;
5        int count = 0;
6        int n = arr.length;
7        for(int i = 0; i < k; i++) {
8            sum += arr[i];
9        }
10
11        if((sum / k) >= threshold) {
12            count++;
13        }
14
15        for(int i = k; i < n; i++) {
16            sum -= arr[i - k];
17            sum += arr[i];
18            
19            if((sum / k) >= threshold) {
20                count++;
21            }
22        }
23
24        return count;
25    }
26}