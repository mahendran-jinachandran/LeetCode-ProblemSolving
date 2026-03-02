1class Solution {
2    public String reverseWords(String s) {
3        
4        StringBuilder result = new StringBuilder();
5        int i = s.length() - 1;
6
7        while(i >= 0) {
8
9            while(i >= 0 && s.charAt(i) == ' ') {
10                i--;
11            }
12
13            if(i < 0) {
14                break;
15
16            }
17
18            int j = i;
19
20            while(j >= 0 && s.charAt(j) != ' ') {
21                j--;
22            }
23
24            result.append(s.substring(j + 1, i + 1));
25            result.append(" ");
26            i = j - 1;
27        }
28
29        return result.toString().trim();
30    }
31}