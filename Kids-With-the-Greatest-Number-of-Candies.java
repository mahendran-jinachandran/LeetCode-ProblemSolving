1class Solution {
2    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
3        
4        int max = 0;
5        for(int candy: candies) {
6            max = Math.max(candy, max);
7        }
8
9        List<Boolean> extra = new ArrayList<>();
10        for(int candy: candies) {
11            extra.add(candy + extraCandies >= max);
12        }
13
14        return extra;
15    }
16}