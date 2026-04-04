1class Solution {
2
3    boolean isAlphaNumberic(char c) {
4        return (c >= 65 && c <= 90) ||
5           (c >= 97 && c <= 122) ||
6           (c >= 48 && c <= 57);
7    }
8
9    public boolean isPalindrome(String s) {
10
11        s = s.toLowerCase();
12        if(s.isEmpty()) { return true; }
13        
14        int i = 0;
15        int j = s.length() - 1;
16
17        while(i <= j) {
18            char firstLetter = s.charAt(i);
19            if(!isAlphaNumberic(firstLetter)) {
20                i++;
21                continue;
22            }
23
24            char lastLetter = s.charAt(j);
25            if(!isAlphaNumberic(lastLetter)) {
26                j--;
27                continue;
28            }
29
30            if(firstLetter != lastLetter) {
31                return false;
32            }
33
34            i++;
35            j--;
36        }
37
38        return true;
39    }
40}