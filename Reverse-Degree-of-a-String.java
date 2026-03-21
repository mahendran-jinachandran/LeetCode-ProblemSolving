1class Solution {
2    public int reverseDegree(String s) {
3
4        int degree = 0;
5        int n = s.length();
6
7        for(int i = 0; i < n; i++) {
8            int reversedValue = 26 - (s.charAt(i) - 'a'); 
9            int value = reversedValue * (i + 1);
10            degree += value;
11        }
12
13        return degree;
14    }
15}