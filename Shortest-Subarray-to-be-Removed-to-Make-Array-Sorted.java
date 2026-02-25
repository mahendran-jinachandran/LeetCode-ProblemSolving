1class Solution {
2    public int findLengthOfShortestSubarray(int[] arr) {
3        
4        int n = arr.length;
5        int l = 0;
6        while(l + 1 < n && arr[l] <= arr[l + 1]) {
7            l++;
8        }
9
10        if(l == n - 1) {
11            return 0;
12        }
13
14        int r = n - 1;
15        while(r - 1 >= 0 && arr[r - 1] <= arr[r]) {
16            r--;
17        }
18
19        int ans = Math.min(n - (l + 1), r);
20        int i = 0, j = r;
21        while (i <= l && j < n) {
22            if (arr[i] <= arr[j]) {
23                ans = Math.min(ans, j - i - 1); 
24                i++;
25            } else {
26                j++;
27            }
28        }
29
30        return ans;
31    }
32}