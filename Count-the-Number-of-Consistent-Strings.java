1class Solution {
2    public int countConsistentStrings(String allowed, String[] words) {
3        boolean[] allow = new boolean[26];
4        for(char c: allowed.toCharArray()) {
5            allow[c - 'a'] = true;
6        }
7
8        int count = 0;
9        for(String word: words) {
10            boolean flag = true;
11            for(char c: word.toCharArray()) {
12                if(!allow[c - 'a']) {
13                    flag = false;
14                    break;
15                }
16            }
17
18            if(flag) {
19                count++;
20            }
21        }
22
23        return count;
24    }
25}