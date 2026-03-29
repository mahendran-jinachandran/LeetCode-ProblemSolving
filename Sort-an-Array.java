1class Solution {
2
3    static void merge(int a[], int b[], int lb, int mid, int ub) {
4        int i = lb;
5        int j = mid + 1;
6        int k = lb;
7
8        while (i <= mid && j <= ub) {
9            if (a[i] < a[j]) {
10                b[k++] = a[i++];
11            } else {
12                b[k++] = a[j++];
13            }
14        }
15
16        while (i <= mid) {
17            b[k++] = a[i++];
18        }
19
20        while (j <= ub) {
21            b[k++] = a[j++];
22        }
23
24        for (k = lb; k <= ub; k++) {
25            a[k] = b[k];
26        }
27    }
28
29    static void mergeSort(int a[], int b[], int lb, int ub) {
30        if (lb < ub) {
31            int mid = (lb + ub) / 2;
32            mergeSort(a, b, lb, mid);
33            mergeSort(a, b, mid + 1, ub);
34            merge(a, b, lb, mid, ub);
35        }
36    }
37
38    public int[] sortArray(int[] nums) {
39        int[] b = new int[nums.length];
40        mergeSort(nums, b, 0, nums.length - 1);
41        return nums;
42    }
43}