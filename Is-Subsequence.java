1class Solution {
2    public boolean isSubsequence(String s, String t) {
3        int sp = 0;
4        int tp = 0;
5        int m = s.length();
6        int n = t.length();
7
8        while (sp < m && tp < n) {
9            if (s.charAt(sp) == t.charAt(tp)) {
10                sp++;
11            }
12            tp++;
13        }
14
15        return sp == s.length();        
16    }
17}