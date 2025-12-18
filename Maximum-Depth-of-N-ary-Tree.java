1/*
2// Definition for a Node.
3class Node {
4    public int val;
5    public List<Node> children;
6
7    public Node() {}
8
9    public Node(int _val) {
10        val = _val;
11    }
12
13    public Node(int _val, List<Node> _children) {
14        val = _val;
15        children = _children;
16    }
17};
18*/
19
20class Solution {
21    public int maxDepth(Node root) {
22
23        if(root == null) {
24            return 0;
25        }
26
27        int ans = 0;
28        for(int i = 0; i < root.children.size(); i++) {
29            int temp = maxDepth(root.children.get(i));
30            ans = Math.max(ans, temp);
31        }
32
33        return ans + 1;
34    }
35}