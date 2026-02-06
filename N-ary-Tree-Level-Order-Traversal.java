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
21    public List<List<Integer>> levelOrder(Node root) {
22
23        if(root == null) {
24            return new ArrayList<>();
25        }
26        
27        List<List<Integer>> result = new ArrayList<>();
28        Queue<Node> queue = new LinkedList<>();
29
30        queue.add(root);
31        int level = 0;
32        while(!queue.isEmpty()) {
33
34            int n = queue.size();
35            result.add(new ArrayList<>());
36            for(int i = 0; i < n; i++) {
37                
38                Node child = queue.poll();
39                result.get(level).add(child.val);
40
41                if(child.children == null) {
42                    continue;
43                }
44
45                List<Node> children = child.children;
46                int childrenCount = children.size();
47                for(int j = 0; j < childrenCount; j++) {
48                    queue.add(children.get(j));
49                }
50            }
51
52            level++;
53        }
54
55        return result;
56    }
57}