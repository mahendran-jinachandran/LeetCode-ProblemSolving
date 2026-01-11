1class Solution {
2    public int[] getAverages(int[] nums, int k) {
3
4        int n = nums.length;
5        int[] arr = new int[n];
6        Arrays.fill(arr, -1);
7
8        int window = 2 * k + 1;
9        if (window > n) {
10            return arr;
11        }
12
13        long sum = 0;
14        for (int i = 0; i < window; i++) {
15            sum += nums[i];
16        }
17
18        arr[k] = (int) (sum / window);
19
20        for (int r = window; r < n; r++) {
21            sum += nums[r];
22            sum -= nums[r - window];
23
24            int center = r - k;
25            arr[center] = (int) (sum / window);
26        }
27
28        return arr;
29    }
30}
31