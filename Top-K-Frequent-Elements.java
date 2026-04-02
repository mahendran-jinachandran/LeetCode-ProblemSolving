1class Solution {
2    public int[] topKFrequent(int[] nums, int k) {
3
4        HashMap<Integer, Integer> map = new HashMap<>();
5        List<Integer>[] frequent = new List[nums.length + 1];
6
7        int size = frequent.length;
8        for(int i = 0; i < size; i++) {
9            frequent[i] = new ArrayList<>();
10        }
11
12        for(int n: nums) {
13            map.put(n, map.getOrDefault(n, 0) + 1);
14        }
15
16        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
17            frequent[entry.getValue()].add(entry.getKey());
18        }
19
20        int index = 0;
21        int[] kFrequent = new int[k];
22
23        for(int i = frequent.length - 1; i > 0 && index < k; i--) {
24            for(int f: frequent[i]) {
25                kFrequent[index++] = f;
26                if(k == index) {
27                    return kFrequent;
28                }
29            }
30        }
31
32        return kFrequent;
33    }
34}