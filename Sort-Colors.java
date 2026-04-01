1class Solution {
2    public void sortColors(int[] nums) {
3        
4        int redCount = 0;
5        int whiteCount = 0;
6        int blueCount = 0;
7
8        for(int num: nums) {
9            if(num == 0) {
10                redCount++;
11            } else if(num == 1) {
12                whiteCount++;
13            } else {
14                blueCount++;
15            }
16        }
17
18
19
20        int i = 0;
21        int k = 0;
22        while(i < redCount) {
23            nums[k++] = 0; 
24            i++;
25        }
26
27        i = 0;
28        while(i < whiteCount) {
29            nums[k++] = 1; 
30            i++;
31        }
32
33        i = 0;
34        while(i < blueCount) {
35            nums[k++] = 2; 
36            i++;
37        }
38
39
40    }
41}