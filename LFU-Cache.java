1
2class LFUCache {
3
4    private static class Node {
5        int key, value, freq;
6        Node prev, next;
7
8        Node(int key, int value) {
9            this.key = key;
10            this.value = value;
11            this.freq = 1;
12        }
13    }
14
15    private static class DoublyLinkedList {
16        Node head, tail;
17        int size;
18
19        DoublyLinkedList() {
20            head = new Node(-1, -1);
21            tail = new Node(-1, -1);
22            head.next = tail;
23            tail.prev = head;
24            size = 0;
25        }
26
27        void addToFront(Node node) {
28            Node first = head.next;
29            head.next = node;
30            node.prev = head;
31            node.next = first;
32            first.prev = node;
33            size++;
34        }
35
36        void remove(Node node) {
37            node.prev.next = node.next;
38            node.next.prev = node.prev;
39            node.prev = null;
40            node.next = null;
41            size--;
42        }
43
44        Node removeLast() {
45            if (size == 0)
46                return null;
47            Node last = tail.prev;
48            remove(last);
49            return last;
50        }
51
52        boolean isEmpty() {
53            return size == 0;
54        }
55    }
56
57    private final int capacity;
58    private int size;
59    private int minFreq;
60
61    private final Map<Integer, Node> keyToNode;
62    private final Map<Integer, DoublyLinkedList> freqToList;
63
64    public LFUCache(int capacity) {
65        this.capacity = capacity;
66        this.size = 0;
67        this.minFreq = 0;
68        this.keyToNode = new HashMap<>();
69        this.freqToList = new HashMap<>();
70    }
71
72    public int get(int key) {
73        Node node = keyToNode.get(key);
74        if (node == null)
75            return -1;
76
77        touch(node);
78        return node.value;
79    }
80
81    public void put(int key, int value) {
82        if (capacity == 0)
83            return;
84
85        Node node = keyToNode.get(key);
86        if (node != null) {
87            node.value = value;
88            touch(node);
89            return;
90        }
91
92        if (size == capacity) {
93            DoublyLinkedList minList = freqToList.get(minFreq);
94            Node evict = minList.removeLast();
95            keyToNode.remove(evict.key);
96            size--;
97        }
98
99        Node newNode = new Node(key, value);
100        keyToNode.put(key, newNode);
101        freqToList.computeIfAbsent(1, f -> new DoublyLinkedList()).addToFront(newNode);
102        minFreq = 1;
103        size++;
104    }
105
106    private void touch(Node node) {
107        int oldFreq = node.freq;
108        DoublyLinkedList oldList = freqToList.get(oldFreq);
109        oldList.remove(node);
110
111        if (oldFreq == minFreq && oldList.isEmpty()) {
112            minFreq++;
113        }
114
115        node.freq++;
116        freqToList.computeIfAbsent(node.freq, f -> new DoublyLinkedList()).addToFront(node);
117    }
118}
119