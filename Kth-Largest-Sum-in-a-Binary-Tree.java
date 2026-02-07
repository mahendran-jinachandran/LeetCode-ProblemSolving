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
17    public long kthLargestLevelSum(TreeNode root, int k) {
18        
19        Queue<TreeNode> queue = new LinkedList<>();
20        PriorityQueue<Long> pq = new PriorityQueue<>();
21        queue.add(root);
22
23        while(!queue.isEmpty()) {
24            int n = queue.size();
25            long sum = 0;
26
27            for(int i = 0; i < n; i++) {
28                TreeNode curr = queue.poll();
29                
30                sum += curr.val;
31                if(curr.left != null) {
32                    queue.add(curr.left);
33                }
34
35                if(curr.right != null) {
36                    queue.add(curr.right);
37                }
38            }
39
40            pq.add(sum);
41            if(pq.size() > k) {
42                pq.remove();
43            }
44        }
45
46        return (k > pq.size()) ? -1 : pq.peek();
47    }
48}