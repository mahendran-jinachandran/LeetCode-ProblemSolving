1class Solution {
2    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
3
4        List<List<Integer>> result = new ArrayList<>();
5        if (root == null) return result;
6
7        Deque<TreeNode> dq = new ArrayDeque<>();
8        dq.addLast(root);
9
10        int level = 0;
11
12        while (!dq.isEmpty()) {
13            int size = dq.size();
14            List<Integer> current = new ArrayList<>();
15
16            for (int i = 0; i < size; i++) {
17                if (level % 2 == 0) {
18
19                    TreeNode node = dq.pollFirst();
20                    current.add(node.val);
21
22                    if (node.left != null) dq.addLast(node.left);
23                    if (node.right != null) dq.addLast(node.right);
24
25                } else {
26
27                    TreeNode node = dq.pollLast();
28                    current.add(node.val);
29
30                    if (node.right != null) dq.addFirst(node.right);
31                    if (node.left != null) dq.addFirst(node.left);
32                }
33            }
34
35            result.add(current);
36            level++;
37        }
38
39        return result;
40    }
41}
42