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
17    public int minDepth(TreeNode root) {
18
19        if(root == null) {
20            return 0;
21        }
22
23        int left = minDepth(root.left);
24        int right = minDepth(root.right);
25
26        if(left == 0) {
27            return 1 + right;
28        }
29
30        if(right == 0) {
31            return 1 + left;
32        }
33
34        return 1 + Math.min(left, right); 
35    }
36}