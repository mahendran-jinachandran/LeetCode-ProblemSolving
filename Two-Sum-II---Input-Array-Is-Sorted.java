1class Solution {
2    public int[] twoSum(int[] numbers, int target) {
3        
4        int[] indices = new int[2];
5        int left = 0;
6        int right = numbers.length - 1;
7
8        while(left < right) {
9            int sum = numbers[left] + numbers[right];
10            if(sum == target) {
11                indices[0] = left + 1;
12                indices[1] = right + 1;
13                return indices;
14            }
15
16            if(sum < target) {
17                left++;
18            } else {
19                right--;
20            }
21        } 
22
23        return indices;
24    }
25}