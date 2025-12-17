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
17}
18*/
19
20class Solution {
21
22    List<Integer> traversal = new ArrayList<>();
23    public List<Integer> postorder(Node root) {
24
25        if(root == null) {
26            return new ArrayList<>();
27        }
28       
29        for(int i = 0; i < root.children.size(); i++) {
30            postorder(root.children.get(i));
31        }
32
33        traversal.add(root.val);
34        return traversal;
35        
36    }
37}