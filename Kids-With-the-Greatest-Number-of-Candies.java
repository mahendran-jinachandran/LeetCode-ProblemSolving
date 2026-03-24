1class Solution {
2    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
3        
4        int max = 0;
5        for(int candy: candies) {
6            if(candy > max) {
7                max = candy;
8            } 
9        }
10
11        List<Boolean> extra = new ArrayList<>();
12        for(int candy: candies) {
13            extra.add(candy + extraCandies >= max);
14        }
15
16        return extra;
17    }
18}