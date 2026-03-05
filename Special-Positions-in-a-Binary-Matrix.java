1class Solution {
2    public int numSpecial(int[][] mat) {
3        
4        int m = mat.length;
5        int n = mat[0].length;
6
7        int[] row = new int[m];
8        int[] col = new int[n];
9
10        for(int i = 0; i < m; i++) {
11            for(int j = 0; j < n; j++) {
12                if(mat[i][j] == 1) {
13                    row[i]++;
14                    col[j]++;
15                }
16            }
17        }
18
19        int count = 0;
20        for(int i = 0; i < m; i++) {
21            for(int j = 0; j < n; j++) {
22                if(mat[i][j] == 1 && row[i] == 1 && col[j] == 1) {
23                    count++;
24                }
25            }
26        }
27
28        return count;
29    }
30}