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
18    Set<Integer> result = new HashSet<>();
19
20    public boolean findTarget(TreeNode root, int k) {
21        
22        if(root == null) {
23            return false;
24        }
25
26        if(result.contains(k - root.val)) {
27            return true;
28        }
29
30        result.add(root.val);
31        return findTarget(root.left, k) || findTarget(root.right, k);
32    }
33}