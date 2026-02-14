1class Solution {
2    public boolean validPalindrome(String s) {
3        int l = 0;
4        int r = s.length() - 1;
5
6        while(l < r) {
7            if(s.charAt(l) == s.charAt(r)) {
8                l++;
9                r--;
10            } else {
11                return isPal(s, l + 1, r) || isPal(s, l, r - 1);
12            }
13        }
14
15        return true;
16    }
17
18    public boolean isPal(String s, int l, int r) {
19        while(l < r) {
20            if(s.charAt(l) == s.charAt(r)) {
21                l++;
22                r--;
23            } else {
24                return false;
25            }
26        }
27
28        return true;
29    }
30
31
32}