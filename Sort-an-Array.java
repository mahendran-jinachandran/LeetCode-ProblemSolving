1class Solution {
2
3    static void merge(int a[], int b[], int lb, int mid, int ub) {
4        int i = lb, j = mid + 1, k = lb;
5
6        while (i <= mid && j <= ub) {
7            if (a[i] < a[j]) {
8                b[k++] = a[i++];
9            } else {
10                b[k++] = a[j++];
11            }
12        }
13
14        while (i <= mid) {
15            b[k++] = a[i++];
16        }
17
18        while (j <= ub) {
19            b[k++] = a[j++];
20        }
21
22        for (k = lb; k <= ub; k++) {
23            a[k] = b[k];
24        }
25    }
26
27    static void mergeSort(int a[], int b[], int lb, int ub) {
28        if (lb < ub) {
29            int mid = (lb + ub) / 2;
30            mergeSort(a, b, lb, mid);
31            mergeSort(a, b, mid + 1, ub);
32            merge(a, b, lb, mid, ub);
33        }
34    }
35
36    public int[] sortArray(int[] nums) {
37        int[] b = new int[nums.length];
38        mergeSort(nums, b, 0, nums.length - 1);
39        return nums;
40    }
41}