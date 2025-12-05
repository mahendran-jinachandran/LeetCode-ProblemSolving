1class Solution {
2    public void setZeroes(int[][] matrix) {
3        
4        int m = matrix.length;
5        int n = matrix[0].length;
6
7        boolean firstRowZero = false;
8        boolean firstColZero = false;
9
10        for (int i = 0; i < n; i++) {
11            if (matrix[0][i] == 0) {
12                firstRowZero = true;
13                break;
14            }
15        }
16
17        for (int i = 0; i < m; i++) {
18            if (matrix[i][0] == 0) {
19                firstColZero = true;
20                break;
21            }
22        }
23
24        for(int i = 1; i < m; i++) {
25            for(int j = 1; j < n; j++) {
26                if(matrix[i][j] == 0) {
27                    matrix[i][0] = 0;
28                    matrix[0][j] = 0;
29                }
30            }
31        }
32
33        for (int i = 1; i < m; i++) {
34            for (int j = 1; j < n; j++) {
35                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
36                    matrix[i][j] = 0;
37                }
38            }
39        }
40
41        if (firstRowZero) {
42            for (int j = 0; j < n; j++) {
43                matrix[0][j] = 0;
44            }
45        }
46
47        if (firstColZero) {
48            for (int i = 0; i < m; i++) {
49                matrix[i][0] = 0;
50            }
51        }
52
53
54
55
56    }
57}