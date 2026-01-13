1class Solution {
2    public int totalFruit(int[] fruits) {
3
4        int left = 0;
5        int best = 0;
6        Map<Integer, Integer> freq = new HashMap<>();
7        
8        for (int right = 0; right < fruits.length; right++) {
9
10            freq.put(fruits[right], freq.getOrDefault(fruits[right], 0) + 1);
11
12            while (freq.size() > 2) {
13                freq.put(fruits[left], freq.get(fruits[left]) - 1);
14                if (freq.get(fruits[left]) == 0) {
15                    freq.remove(fruits[left]);
16                }
17                left++;
18            }
19
20            best = Math.max(best, right - left + 1);
21        }
22
23        return best;
24    }
25}