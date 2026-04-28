1class Solution {
2    public int mySqrt(int x) {
3
4        if (x == 0 || x == 1)
5            return x;
6
7        int start = 1;
8        int end = x;
9        int mid = -1;
10
11
12        while (start <= end) {
13      
14            mid = start + (end - start) / 2;
15
16            if ((long) mid * mid > (long) x)
17                end = mid - 1;
18            else if (mid * mid == x)
19                return mid;
20            else
21                start = mid + 1;
22        }
23        
24        return Math.round(end);
25    }
26}