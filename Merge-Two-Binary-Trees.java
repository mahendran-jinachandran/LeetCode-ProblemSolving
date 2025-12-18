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
17    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
18        
19        if(root1 == null && root2 == null) {
20            return null;
21        }
22
23        if(root1 == null) {
24            return root2;
25        }
26
27        if(root2 == null) {
28            return root1;
29        }
30
31        TreeNode newNode = new TreeNode(root1.val + root2.val);
32        newNode.left = mergeTrees(root1.left, root2.left);
33        newNode.right = mergeTrees(root1.right, root2.right);
34        return newNode;
35    }
36}