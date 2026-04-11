1class Solution {
2    public int trap(int[] height) {
3        
4        int left = 0;
5        int right = height.length - 1;
6
7        int leftMax = 0;
8        int rightMax = 0;
9        int water = 0;
10
11        while(left < right) {
12            if(height[left] < height[right]) {
13                if(height[left] > leftMax) {
14                    leftMax = height[left];
15                } else {
16                    water += leftMax - height[left];
17                }
18
19                left++;
20            } else {
21                if(height[right] > rightMax) {
22                    rightMax = height[right];
23                } else {
24                    water += rightMax - height[right];
25                }
26
27                right--;
28            }
29        }
30
31        return water;
32    }
33}