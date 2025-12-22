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
18    public int updateTree(TreeNode root, int sum) {
19        if (root == null) {
20            return sum;
21        }
22
23        sum = updateTree(root.right, sum);
24
25        sum += root.val;
26        root.val = sum;
27
28        sum = updateTree(root.left, sum);
29        return sum;
30    }
31
32    public TreeNode bstToGst(TreeNode root) {
33        updateTree(root, 0);
34        return root;
35    }
36}