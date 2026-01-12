1class Solution {
2
3    public boolean matches(int a[], int b[]) {
4        for(int i = 0; i < 26; i++) {
5            if(a[i] != b[i]) {
6                return false;
7            }
8        }
9
10        return true;
11    }
12
13    public boolean checkInclusion(String s1, String s2) {
14        
15        int m = s1.length();
16        int n = s2.length();
17        if(m > n) {
18            return false;
19        }
20
21        int[] window = new int[26];
22        int[] need = new int[26]; 
23
24        for(int i = 0; i < m; i++) {
25            need[s1.charAt(i) - 'a']++;
26            window[s2.charAt(i) - 'a']++;
27        }
28
29        if (matches(need, window)) {
30            return true;
31        }
32
33        for (int r = m; r < n; r++) {
34            window[s2.charAt(r) - 'a']++;         
35            window[s2.charAt(r - m) - 'a']--;  
36
37            if (matches(need, window)) {
38              return true;
39            }
40        }
41
42        return false;
43    }
44}