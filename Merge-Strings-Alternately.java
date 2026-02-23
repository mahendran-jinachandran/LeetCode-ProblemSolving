1class Solution {
2    public String mergeAlternately(String word1, String word2) {
3
4       StringBuilder result = new StringBuilder();
5
6       int i = 0;
7       int m = word1.length();
8       int n = word2.length();
9
10       while(i < m && i < n) {
11            result.append(word1.charAt(i));
12            result.append(word2.charAt(i++));
13       } 
14
15       while(i < m) {
16            result.append(word1.charAt(i++));
17       } 
18
19       while(i < n) {
20            result.append(word2.charAt(i++));
21       }
22
23       return result.toString();
24    }
25}