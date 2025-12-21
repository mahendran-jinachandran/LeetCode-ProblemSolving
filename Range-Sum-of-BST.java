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
18    public int rangeSumBST(TreeNode root, int low, int high) {
19        
20        if (root == null) {
21            return 0;
22        }
23
24        int currentVal = (root.val >= low && root.val <= high) ? root.val : 0;
25
26        int leftSum = rangeSumBST(root.left, low, high);
27        int rightSum = rangeSumBST(root.right, low, high);
28
29        return currentVal + leftSum + rightSum;
30    }
31}