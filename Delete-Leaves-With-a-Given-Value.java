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
17    public TreeNode removeLeafNodes(TreeNode root, int target) {
18        
19        if(root == null) {
20            return null;
21        }
22
23        root.left = removeLeafNodes(root.left, target);
24        root.right = removeLeafNodes(root.right, target);
25
26        if(root.left == null && root.right == null && root.val == target) {
27            return null;
28        }
29
30        return root;
31    }
32}