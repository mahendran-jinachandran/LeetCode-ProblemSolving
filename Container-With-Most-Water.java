1class Solution {
2    public int maxArea(int[] height) {
3        
4        int left = 0;
5        int right = height.length - 1;
6
7        int max = 0;
8        while(left < right) {
9            int width = Math.min(height[left], height[right]);
10            int dist = right - left;
11            int area = width * dist;
12
13            if(area > max) {
14                max = area;
15            }
16
17            if(height[left] < height[right]) {
18                left++;
19            } else {
20                right--;
21            }
22        }
23
24        return max;
25    }
26}