1class Solution {
2    public void merge(int[] nums1, int m, int[] nums2, int n) {
3        
4        int p1 = m - 1, p2 = n - 1, p = m + n - 1;
5
6        while(p1 >= 0 && p2 >= 0) {
7            if(nums1[p1] > nums2[p2]) {
8                nums1[p] = nums1[p1];
9                p1--;
10            } else {
11                nums1[p] = nums2[p2];
12                p2--;
13            }
14
15            p--;
16        }
17
18        while (p2 >= 0) {
19            nums1[p--] = nums2[p2--];
20        }
21    }
22}