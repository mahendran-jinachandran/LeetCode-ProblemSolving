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
17    public List<Integer> rightSideView(TreeNode root) {
18
19        if(root == null) {
20            return new ArrayList<>();
21        }
22        
23        Queue<TreeNode> queue = new LinkedList<>();
24        List<Integer> result = new ArrayList<>();
25        queue.add(root);
26
27
28        while(!queue.isEmpty()) {
29
30            int size = queue.size();
31
32            for(int i = 0; i < size; i++) {
33
34                TreeNode temp = queue.poll();
35                if(i == size - 1) {
36                    result.add(temp.val);
37                }
38
39                if(temp.left != null) {
40                    queue.add(temp.left);
41                }
42
43                if(temp.right != null) {
44                    queue.add(temp.right);
45                }
46            }
47        }
48
49        return result;
50
51    }
52}