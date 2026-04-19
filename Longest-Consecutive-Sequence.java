1class Solution {
2    public int longestConsecutive(int[] nums) {
3        Set<Integer> numSet = new HashSet<Integer>();
4    
5        for(int num: nums) {
6            numSet.add(num);
7        }
8
9        int maximum = 0;
10        for(int num: numSet) {
11            if(!numSet.contains(num - 1)) {
12
13                int length = 1;
14                while(numSet.contains(length + num)) {
15                    length++;
16                }
17
18                maximum = Math.max(length, maximum);
19            }
20        }
21
22        return maximum;
23    }
24}