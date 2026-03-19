1class Solution {
2    public int numJewelsInStones(String jewels, String stones) {
3        
4        HashMap<Character, Integer> map = new HashMap<>();
5        int stonesLength = stones.length();
6        int jewelsLength = jewels.length();
7
8        for(int i = 0; i < stonesLength; i++) {
9            char a = stones.charAt(i);
10            map.put(a, map.getOrDefault(a, 0) + 1);
11        }
12
13        int count = 0;
14        for(int i = 0; i < jewelsLength; i++) {
15            char a = jewels.charAt(i);
16            count += map.getOrDefault(a, 0);
17        }
18
19        return count;
20    }
21}