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
17    public int sumEvenGrandparent(TreeNode root) {
18        return grandParent(root, null, null);
19    }
20
21    public int grandParent(TreeNode current, TreeNode parent, TreeNode grandParent) {
22        int sum = 0;
23        if(current == null) {
24            return 0;
25        }
26
27        if(grandParent != null && grandParent.val % 2 == 0) {
28            sum += current.val;
29        }
30
31        sum += grandParent(current.left, current, parent);
32        sum += grandParent(current.right, current, parent);
33        return sum;
34    }
35}