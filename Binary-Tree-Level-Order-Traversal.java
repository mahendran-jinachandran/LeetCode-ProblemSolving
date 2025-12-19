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
17    public List<List<Integer>> levelOrder(TreeNode root) {
18
19        if(root == null) {
20            return new ArrayList<>();
21        }
22
23        List<List<Integer>> list = new ArrayList<>();
24        Queue<TreeNode> queue = new LinkedList<>();
25        queue.add(root);
26        int currentLevel = 0;
27
28        while(!queue.isEmpty()) {
29            list.add(new ArrayList<Integer>());
30
31            int size = queue.size();
32
33            for(int i = 0; i < size; i++) {   
34                TreeNode node = queue.poll();
35                list.get(currentLevel).add(node.val);
36                if(node.left != null) {
37                    queue.add(node.left);
38                }
39
40                if(node.right != null) {
41                    queue.add(node.right);
42                }
43            }
44
45            currentLevel++;
46        }
47
48        return list;
49    }
50}