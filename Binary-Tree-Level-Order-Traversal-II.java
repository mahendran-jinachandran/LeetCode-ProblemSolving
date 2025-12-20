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
17    public List<List<Integer>> levelOrderBottom(TreeNode root) {
18
19        if(root == null) {
20            return new ArrayList<>();
21        }
22
23        List<List<Integer>> finalList = new ArrayList<>();
24        Queue<TreeNode> queue = new LinkedList<>();
25        queue.add(root);
26        int currentLevel = 0;
27        while(!queue.isEmpty()) {
28            
29            int size = queue.size();
30            finalList.add(new ArrayList<>());
31
32            for(int i = 0; i < size; i++) {
33
34                TreeNode newNode = queue.poll();
35                finalList.get(currentLevel).add(newNode.val);
36
37                if(newNode.left != null) {
38                    queue.add(newNode.left);
39                }
40
41                if(newNode.right != null) {
42                    queue.add(newNode.right);
43                }
44            }   
45
46            currentLevel++;
47        }
48
49        Collections.reverse(finalList);
50        return finalList;
51    }
52}