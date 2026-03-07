1class Solution {
2    public int romanToInt(String s) {
3        
4        int res = 0;
5        Map<Character, Integer> map = new HashMap<>();
6        map.put('I', 1);
7        map.put('V', 5);
8        map.put('X', 10);
9        map.put('L', 50);
10        map.put('C', 100);
11        map.put('D', 500);
12        map.put('M', 1000);
13
14        int n = s.length() - 1;
15        for(int i = 0; i < n; i++) {
16            if(map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
17                res -= map.get(s.charAt(i));
18            } else {
19                res += map.get(s.charAt(i)); 
20            }
21        }
22
23        return res + map.get(s.charAt(n)); 
24    }
25}