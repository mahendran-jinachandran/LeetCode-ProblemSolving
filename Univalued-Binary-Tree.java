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
18    public boolean isSame(TreeNode root, int value) {
19        if(root == null) {
20            return true;
21        }
22
23        if(root.val != value) {
24            return false;
25        }
26
27        return isSame(root.left, value) && isSame(root.right, value);
28    }
29
30    public boolean isUnivalTree(TreeNode root) {
31        return isSame(root, root.val);
32    }
33}