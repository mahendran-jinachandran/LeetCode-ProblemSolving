1class Solution {
2    public int maxDistinct(String s) {
3        
4        int[] map = new int[26];
5        int n = s.length();
6        
7        int count = 0;
8
9        for(int i = 0; i < n; i++) {
10            char c = s.charAt(i);
11            if(map[c - 'a'] == 0) {
12                count++;
13                map[c - 'a']++;
14            } 
15        }
16
17        return count;
18    }
19}