1class Solution {
2    public String longestPalindrome(String s) {
3        
4        if (s == null || s.length() == 0) {
5            return "";
6        }
7
8        String longest = "";
9        int n = s.length();
10        for(int i = 0; i < n; i++) {
11            String odd = buildAroundCenter(s, i, i, n);
12            String even = buildAroundCenter(s, i, i + 1, n);
13
14            int longestLength = longest.length();
15            if(odd.length() > longestLength) {
16                longest = odd;
17            }
18
19            if(even.length() > longestLength) {
20                longest = even;
21            }
22        }
23
24        return longest;
25    }
26
27
28    public String buildAroundCenter(String s, int left, int right, int n) {
29        while(left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
30            left--;
31            right++;
32        }
33
34        return s.substring(left + 1, right);
35    }
36}