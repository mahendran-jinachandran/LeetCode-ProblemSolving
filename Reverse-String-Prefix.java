1class Solution {
2    public String reversePrefix(String s, int k) {
3        
4        char[] str = s.toCharArray();
5        int i = 0;
6        int j = k - 1;
7        while(i < j) {
8            char temp = str[i];
9            str[i] = str[j];
10            str[j] = temp;
11            i++;
12            j--;
13        }
14
15        return new String(str);
16    }
17}