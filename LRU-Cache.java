1import java.util.HashMap;
2import java.util.Map;
3
4class LRUCache {
5
6    private static class Node {
7        int key;
8        int value;
9        Node prev;
10        Node next;
11
12        Node(int key, int value) {
13            this.key = key;
14            this.value = value;
15        }
16    }
17
18    private final int capacity;
19    private final Map<Integer, Node> map;
20
21    // Dummy head and tail to simplify edge cases
22    private final Node head;
23    private final Node tail;
24
25    public LRUCache(int capacity) {
26        this.capacity = capacity;
27        this.map = new HashMap<>();
28
29        head = new Node(-1, -1);
30        tail = new Node(-1, -1);
31        head.next = tail;
32        tail.prev = head;
33    }
34
35    public int get(int key) {
36        Node node = map.get(key);
37        if (node == null) return -1;
38
39        moveToFront(node);
40        return node.value;
41    }
42
43    public void put(int key, int value) {
44        Node node = map.get(key);
45
46        if (node != null) {
47            node.value = value;
48            moveToFront(node);
49            return;
50        }
51
52        Node newNode = new Node(key, value);
53        map.put(key, newNode);
54        addToFront(newNode);
55
56        if (map.size() > capacity) {
57            Node lru = removeLRU();
58            map.remove(lru.key);
59        }
60    }
61
62    private void moveToFront(Node node) {
63        remove(node);
64        addToFront(node);
65    }
66
67    private void addToFront(Node node) {
68        Node first = head.next;
69
70        head.next = node;
71        node.prev = head;
72
73        node.next = first;
74        first.prev = node;
75    }
76
77    private void remove(Node node) {
78        Node p = node.prev;
79        Node n = node.next;
80
81        p.next = n;
82        n.prev = p;
83    }
84
85    private Node removeLRU() {
86        Node lru = tail.prev;
87        remove(lru);
88        return lru;
89    }
90}
91