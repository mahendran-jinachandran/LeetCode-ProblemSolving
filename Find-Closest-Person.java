1class Solution {
2    public int findClosest(int x, int y, int z) {
3       int a=Math.abs(z-x);
4        int b=Math.abs(z-y);
5        if(a==b)
6        return 0;
7        else if(a>b)
8        return 2;
9        else
10        return 1;
11    }
12}