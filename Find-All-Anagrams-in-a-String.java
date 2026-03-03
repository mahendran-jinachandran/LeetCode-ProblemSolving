1class Solution {
2    public List<Integer> findAnagrams(String s, String p) {
3        
4        List<Integer> res = new ArrayList<>();
5        int n = s.length(), m = p.length();
6
7        if(m > n) {
8            return res;
9        }
10
11        int[] diff = new int[26];
12        for(int i = 0; i < m; i++) {
13            diff[p.charAt(i) - 'a']++;
14            diff[s.charAt(i) - 'a']--;
15        } 
16
17        int zeroes = 0;
18        for(int x: diff) {
19            if(x == 0) {
20                zeroes++;
21            }
22        }
23
24        if(zeroes == 26) {
25            res.add(0);
26        }
27
28        for(int r = m; r < n; r++) {
29            int add = s.charAt(r) - 'a';
30            int rem = s.charAt(r - m) - 'a';
31
32            zeroes -= (diff[add] == 0) ? 1 : 0;
33            diff[add]--;
34            zeroes += (diff[add] == 0) ? 1 : 0;
35
36            zeroes -= (diff[rem] == 0) ? 1 : 0;
37            diff[rem]++;
38            zeroes += (diff[rem] == 0) ? 1 : 0;
39
40            if (zeroes == 26) res.add(r - m + 1);
41        }
42
43        return res;
44    }
45}