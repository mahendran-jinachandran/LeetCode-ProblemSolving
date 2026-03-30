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
14    int SIZE = 1000;
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
47    }
48    
49    public int get(int key) {
50        int index = hash(key);
51        Node head = buckets[index];
52
53        Node curr = head;
54        while(curr != null) {
55            if(curr.key == key) {
56                return curr.value;
57            }
58
59            curr = curr.next;
60        }
61
62        return -1;
63    }
64    
65    public void remove(int key) {
66        int index = hash(key);
67        Node curr = buckets[index];
68        Node prev = null;
69
70        while (curr != null) {
71            if (curr.key == key) {
72                if (prev == null) {
73                    buckets[index] = curr.next; 
74                } else {
75                    prev.next = curr.next;
76                }
77                return;
78            }
79            prev = curr;
80            curr = curr.next;
81        }
82    }
83}
84
85/**
86 * Your MyHashMap object will be instantiated and called as such:
87 * MyHashMap obj = new MyHashMap();
88 * obj.put(key,value);
89 * int param_2 = obj.get(key);
90 * obj.remove(key);
91 */