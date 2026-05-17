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
16
17class Solution {
18    public int kthSmallest(TreeNode root, int k) {
19        
20        List<Integer> arr = new ArrayList<>();
21
22        dfs(root, arr);
23        return arr.get(k - 1);
24    }
25
26    public void dfs(TreeNode root, List<Integer> arr) {
27        if(root == null) {
28            return;
29        }
30
31        dfs(root.left, arr);
32        arr.add(root.val);
33        dfs(root.right, arr);
34    }
35}
36