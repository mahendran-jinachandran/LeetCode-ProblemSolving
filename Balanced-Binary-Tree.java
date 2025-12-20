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
17
18    public int isBalancedOrNot(TreeNode root) {
19        if(root == null) {
20            return 0;
21        }
22
23        int left = isBalancedOrNot(root.left);
24        int right = isBalancedOrNot(root.right);
25
26        if(left == -1 || right == -1 || Math.abs(left - right) > 1) {
27            return -1;
28        }
29
30        return Math.max(left, right) + 1;
31    }
32    public boolean isBalanced(TreeNode root) {
33        return isBalancedOrNot(root) >= 0;
34        
35    }
36}