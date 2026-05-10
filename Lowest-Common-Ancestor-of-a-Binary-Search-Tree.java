1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode(int x) { val = x; }
8 * }
9 */
10
11class Solution {
12    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
13        return lca(root, p ,q);
14    }
15
16    public TreeNode lca(TreeNode root, TreeNode p, TreeNode q) {
17        if(root == null) {
18            return null;
19        }
20
21        if(p.val > root.val && q.val > root.val) {
22            return lca(root.right, p, q);
23        }
24
25        if(p.val < root.val && q.val < root.val) {
26            return lca(root.left, p , q);
27        }
28
29        return root;
30    }
31}