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
18    public boolean checkSymmetry(TreeNode left, TreeNode right) {
19        if(left == null && right == null) {
20            return true;
21        }
22
23        if(left == null || right == null || left.val != right.val) {
24            return false;
25        }
26
27        return checkSymmetry(left.left, right.right) && checkSymmetry(left.right, right.left);
28    }
29
30
31    public boolean isSymmetric(TreeNode root) {
32        
33        if(root == null) {
34            return true;
35        }
36
37        return checkSymmetry(root.left, root.right);
38    }
39}