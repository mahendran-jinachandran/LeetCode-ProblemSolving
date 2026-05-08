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
18
19    public boolean areIdentical(TreeNode root, TreeNode subroot) {
20
21        if(root == null && subroot == null) {
22            return true;
23        }
24
25        if(root == null || subroot == null) {
26            return false;
27        }
28
29        return (root.val == subroot.val && areIdentical(root.left, subroot.left)
30        && areIdentical(root.right, subroot.right));
31    }
32    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
33        if(subRoot == null) {
34            return true;
35        }
36
37        if(root == null) {
38            return false;
39        }
40
41        if(areIdentical(root, subRoot)) {
42            return true;
43        }
44
45        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
46    }
47}
48