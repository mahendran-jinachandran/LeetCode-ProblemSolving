1class Solution {
2    public int smallestEvenMultiple(int n) {
3        
4        int number = 0;
5        int mult = n;
6        while(true) {
7            if(mult % n == 0 && mult % 2 == 0) {
8                number = mult;
9                break;
10            }
11
12            mult *= 2;
13        }
14
15        return number;
16    }
17}