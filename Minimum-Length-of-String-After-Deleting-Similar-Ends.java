1class Solution {
2    public int minimumLength(String s) {
3
4        int i = 0, j = s.length() - 1;
5
6        while (i < j && s.charAt(i) == s.charAt(j)) {
7            char ch = s.charAt(i);
8
9            while (i <= j && s.charAt(i) == ch)  {
10                i++;
11            }
12
13            while (i <= j && s.charAt(j) == ch) {
14                j--;
15            }
16        }
17
18        return (i > j) ? 0 : (j - i + 1);
19    }
20}