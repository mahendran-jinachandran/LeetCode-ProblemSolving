1class Solution {
2    public int findClosest(int x, int y, int z) {
3        
4        int firstAndThird = Math.abs(x - z);
5        int secondAndThird = Math.abs(y - z);
6
7        return firstAndThird == secondAndThird ? 0 : firstAndThird < secondAndThird ? 1 : 2;
8    }
9}