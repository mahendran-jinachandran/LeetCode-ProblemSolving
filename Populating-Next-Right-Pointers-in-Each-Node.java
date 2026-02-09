1/*
2// Definition for a Node.
3class Node {
4    public int val;
5    public Node left;
6    public Node right;
7    public Node next;
8
9    public Node() {}
10    
11    public Node(int _val) {
12        val = _val;
13    }
14
15    public Node(int _val, Node _left, Node _right, Node _next) {
16        val = _val;
17        left = _left;
18        right = _right;
19        next = _next;
20    }
21};
22*/
23
24class Solution {
25    public Node connect(Node root) {
26        if(root == null) {
27            return root;
28        }
29
30        Queue<Node> queue = new LinkedList<>();
31        queue.add(root);
32
33        while(!queue.isEmpty()) {
34
35            int n = queue.size();
36            Node prevNode = null;
37            for(int i = 0; i < n;i++) {
38                var currentNode = queue.poll();
39                if(prevNode != null) {
40                    prevNode.next = currentNode;
41                }
42
43                prevNode = currentNode;
44                if(currentNode.left != null) {
45                    queue.add(currentNode.left);
46                }
47
48                if(currentNode.right != null) {
49                    queue.add(currentNode.right);
50                }
51            }
52        }
53
54        return root;
55    }
56}