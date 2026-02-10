1class Solution {
2    public boolean isCompleteTree(TreeNode root) {
3
4        Queue<TreeNode> queue = new LinkedList<>();
5        queue.offer(root);
6
7        boolean seenNull = false;
8
9        while (!queue.isEmpty()) {
10            TreeNode node = queue.poll();
11
12            if (node == null) {
13                seenNull = true;
14            } else {
15                if (seenNull) {
16                    return false;
17                }
18                queue.add(node.left);
19                queue.add(node.right);
20            }
21        }
22
23        return true;
24    }
25}
26