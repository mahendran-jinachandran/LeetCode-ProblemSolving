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
17    public TreeNode searchBST(TreeNode root, int val) {
18
19        if(root == null) {
20            return null;
21        }
22
23        if(root.val == val) {
24            return root;
25        }
26
27        if(root.val > val) {
28            return searchBST(root.left, val);
29        }
30
31        return searchBST(root.right, val);
32    }
33}