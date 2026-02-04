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
17    public List<Integer> largestValues(TreeNode root) {
18
19        if(root == null) {
20            return new ArrayList<>();
21        }
22        
23        List<Integer> values = new ArrayList<>();
24        Queue<TreeNode> queue = new LinkedList<>();
25        queue.add(root);
26
27        while(!queue.isEmpty()) {
28            int n = queue.size();
29            int max = Integer.MIN_VALUE;
30
31            for(int i = 0; i < n; i++) {
32                TreeNode node = queue.poll();
33                if(node.left != null) {
34                    queue.add(node.left);
35                }
36
37                if(node.right != null) {
38                    queue.add(node.right);
39                }
40
41                if(node.val > max) {
42                    max = node.val;
43                }
44            }
45
46            values.add(max);
47        }
48
49        return values;
50    }
51}