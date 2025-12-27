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
18    int maxDiameter = 0;
19
20    public int diameterBinaryTree(TreeNode root) {
21        if(root == null) {
22            return 0;
23        }
24
25        int leftHeight = diameterBinaryTree(root.left);
26        int rightHeight = diameterBinaryTree(root.right);
27
28        if(leftHeight + rightHeight > maxDiameter) {
29            maxDiameter = leftHeight + rightHeight;
30        }
31
32        return Math.max(leftHeight, rightHeight) + 1;
33    }
34
35    public int diameterOfBinaryTree(TreeNode root) {
36       diameterBinaryTree(root);
37       return maxDiameter;
38    }
39}