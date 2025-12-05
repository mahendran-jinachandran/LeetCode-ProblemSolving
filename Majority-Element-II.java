1class Solution {
2    public List<Integer> majorityElement(int[] nums) {
3        
4        int count1 = 0;
5        int count2 = 0;
6        int ele1 = Integer.MIN_VALUE;
7        int ele2 = Integer.MIN_VALUE;
8        int n = nums.length;
9
10        for(int i = 0; i < n; i++) {
11            if(count1 == 0 && ele2 != nums[i]) {
12                count1 = 1;
13                ele1 = nums[i];
14            } else if(count2 == 0 && ele1 != nums[i]) {
15                count2 = 1;
16                ele2 = nums[i];
17            } else if(ele1 == nums[i]) {
18                count1++;
19            } else if(ele2 == nums[i]) {
20                count2++;
21            } else {
22                count1--;
23                count2--;
24            }
25        }
26
27        count1 = 0;
28        count2 = 0;
29        for(int i = 0; i < n; i++) {
30            if(nums[i] == ele1) {
31                count1++;
32            } else if(nums[i] == ele2) {
33                count2++;
34            }
35        }
36
37        int minim = n / 3 + 1;
38        List<Integer> majority = new ArrayList<>();
39         if(count1 >= minim) {
40            majority.add(ele1);
41         } 
42
43         if(count2 >= minim) {
44            majority.add(ele2);
45         }
46
47        return majority;
48
49    }
50}