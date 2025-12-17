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
18    List<Integer> traversal = new LinkedList<>();
19    public List<Integer> postorderTraversal(TreeNode root) {
20
21        if(root == null) {
22            return new ArrayList<>();
23        }
24
25
26        postorderTraversal(root.left);
27        postorderTraversal(root.right);
28        traversal.add(root.val);
29        return traversal;
30        
31    }
32}