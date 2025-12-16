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
18    List<Integer> ans = new LinkedList<Integer>();
19    public List<Integer> inorderTraversal(TreeNode root) {
20
21        if(root == null) {
22            return new LinkedList<Integer>();
23        }
24
25        inorderTraversal(root.left);
26        ans.add(root.val);
27        inorderTraversal(root.right);
28        return ans;
29    }
30}