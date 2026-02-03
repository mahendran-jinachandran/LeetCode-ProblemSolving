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
17    public int countNodes(TreeNode root) {
18        if(root == null) {
19            return 0;
20        }
21
22        int leftHeight = getHeight(root.left);
23        int rightHeight = getHeight(root.right);
24
25        if(leftHeight == rightHeight) {
26            return (1 << leftHeight) + countNodes(root.right);
27        } else {
28            return (1 << rightHeight) + countNodes(root.left);
29        }
30    }
31
32    public int getHeight(TreeNode node) {
33        int h = 0;
34        while(node != null) {
35            h++;
36            node = node.left;
37        }
38
39        return h;
40    }
41}