1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public boolean isEvenOddTree(TreeNode root) {
18        
19        Queue<TreeNode> queue = new LinkedList<>();
20        queue.add(root); 
21        int level = 0;
22
23        while(!queue.isEmpty()) {
24            int decreasingValue = Integer.MAX_VALUE;
25            int increasingValue = 0;
26            int n = queue.size();
27            for(int i = 0; i < n; i++) {
28
29                TreeNode curr = queue.poll();
30                if(level % 2 == 0) {
31                    if(curr.val % 2 == 0 || curr.val <= increasingValue)  {
32                        return false;
33                    }
34
35                    increasingValue = curr.val;
36
37                } else { 
38                    if(curr.val % 2 != 0 || curr.val >= decreasingValue) {
39                        return false;
40                    }
41
42                    decreasingValue = curr.val;
43                }
44
45
46                if(curr.left != null) {
47                    queue.add(curr.left);
48                }
49
50                if(curr.right != null) {
51                    queue.add(curr.right);
52                }
53            }
54
55            level++;
56        }
57
58
59        return true;
60    }
61}