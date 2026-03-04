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
17    public List<String> binaryTreePaths(TreeNode root) {
18        List<String> result = new ArrayList<>();
19        if(root != null) {
20            searchTree(root, "", result);
21        }
22
23        return result;
24    }
25
26    private void searchTree(TreeNode root, String path, List<String> result) {
27        if(root.left == null && root.right == null) {
28            result.add(path + root.val);
29        }
30
31        if(root.left != null) {
32            searchTree(root.left, path + root.val + "->", result);
33        }
34
35        if(root.right != null) {
36            searchTree(root.right, path + root.val + "->", result);
37        }
38    }
39}