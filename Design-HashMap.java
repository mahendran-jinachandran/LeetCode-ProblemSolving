1class MyHashMap {
2
3    class Node {
4        int key, value;
5        Node next;
6
7        Node(int key, int value) {
8            this.key = key;
9            this.value = value;
10        }
11    }
12
13    private Node[] buckets;
14    int SIZE = 100000;
15
16    public MyHashMap() {
17        buckets = new Node[SIZE];
18    }
19
20    private int hash(int key) {
21        return key % SIZE;
22    }
23    
24    public void put(int key, int value) {
25        int index = hash(key);
26        Node head = buckets[index];
27
28        if(head == null) {
29            buckets[index] = new Node(key, value);
30            return;
31        }
32
33        Node curr = head;
34
35        while(curr != null) {
36            if(curr.key == key) {
37                curr.value = value;
38                return;
39            }
40            
41            if(curr.next == null) {
42                curr.next = new Node(key, value);
43            }
44
45            curr = curr.next;
46        }
47
48        
49    }
50    
51    public int get(int key) {
52        int index = hash(key);
53        Node head = buckets[index];
54
55        Node curr = head;
56        while(curr != null) {
57            if(curr.key == key) {
58                return curr.value;
59            }
60
61            curr = curr.next;
62        }
63
64        return -1;
65    }
66    
67    public void remove(int key) {
68        int index = hash(key);
69        Node curr = buckets[index];
70        Node prev = null;
71
72        while (curr != null) {
73            if (curr.key == key) {
74                if (prev == null) {
75                    buckets[index] = curr.next; 
76                } else {
77                    prev.next = curr.next;
78                }
79                return;
80            }
81            prev = curr;
82            curr = curr.next;
83        }
84    }
85}
86
87/**
88 * Your MyHashMap object will be instantiated and called as such:
89 * MyHashMap obj = new MyHashMap();
90 * obj.put(key,value);
91 * int param_2 = obj.get(key);
92 * obj.remove(key);
93 */