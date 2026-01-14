1class Solution {
2    public int characterReplacement(String s, int k) {
3        
4        int left = 0;
5        int maxFreq = 0;
6        int best = 0;
7
8        int[] arr = new int[26];
9        int n = s.length();
10        for(int right = 0; right < n; right++) {
11
12            int value = s.charAt(right) - 'A';
13            arr[value]++;
14            maxFreq = Math.max(maxFreq, arr[value]);
15
16            while((right - left + 1) - maxFreq > k) {
17                arr[s.charAt(left) - 'A']--;
18                left++;
19            }
20
21            best = Math.max(best, right - left + 1);
22        }
23
24        return best;
25    }
26}