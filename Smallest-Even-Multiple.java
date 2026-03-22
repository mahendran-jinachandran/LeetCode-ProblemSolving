1class Solution {
2    public int smallestEvenMultiple(int n) {
3        
4        if(n%2==0){
5            return n;
6        } else{
7            return 2*n;
8        }
9    }
10}