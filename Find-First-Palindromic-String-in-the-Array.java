1class Solution {
2    public boolean isPalindrome(String word) {
3        int n = word.length();
4        int i = 0;
5        int j = n - 1;
6        while(i < j) {
7            if(!(word.charAt(i) == word.charAt(j))) {
8                return false;
9            }
10
11            i++;
12            j--;
13        }
14
15        return true;
16    }
17
18    public String firstPalindrome(String[] words) {
19        for(String word: words) {
20            if(isPalindrome(word)) {
21                return word;
22            }
23        }
24
25        return "";
26    }
27}