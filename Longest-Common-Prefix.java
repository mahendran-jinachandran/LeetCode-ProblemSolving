1class Solution {
2    public int getCommon(String s1, String s2) {
3
4        int l = Math.min(s1.length(), s2.length());
5        int i = 0;
6        while(i < l && s1.charAt(i) == s2.charAt(i)) {
7            i++;
8        }
9
10        return i;
11    }
12    public String longestCommonPrefix(String[] strs) {
13        
14        String res = strs[0];
15        int n = strs.length;
16
17        for(int i = 1; i < n; i++) {
18            int idx = getCommon(res, strs[i]);
19            res = res.substring(0 , idx);
20        }
21
22        return res;
23    }
24}