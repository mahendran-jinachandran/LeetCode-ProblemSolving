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
17    public TreeNode replaceValueInTree(TreeNode root) {
18        Queue<TreeNode> queue = new LinkedList<>();
19
20        root.val = 0;
21        queue.add(root);
22
23        while(!queue.isEmpty()) {
24            List<TreeNode> nodes = new ArrayList<>();
25            int levelSum = 0;
26
27            int n = queue.size();
28            for(int i = 0; i < n; i++) {
29                TreeNode curr = queue.poll();
30                nodes.add(curr);
31
32                if(curr.left != null) {
33                    queue.add(curr.left);
34                    levelSum += curr.left.val;
35                }
36
37                if(curr.right != null) {
38                    queue.add(curr.right);
39                    levelSum += curr.right.val;
40                }
41            }
42
43            for(TreeNode node: nodes) {
44                
45                int sum = levelSum;
46                if (node.left != null) {
47                    sum -= node.left.val;
48                }
49                if (node.right != null) {
50                    sum -= node.right.val;
51                }
52                if (node.left != null) {
53                    node.left.val = sum;
54                }
55                if (node.right != null) {
56                    node.right.val = sum;
57                }
58            }
59        }
60
61        return root;
62    }
63}