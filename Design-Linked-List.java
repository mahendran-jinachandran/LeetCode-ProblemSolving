1class MyLinkedList {
2
3    private static class Node {
4        int val;
5        Node next;
6        Node(int val) { 
7            this.val = val; 
8        }
9    }
10
11    private Node head;
12
13    public MyLinkedList() {
14        head = null;
15    }
16
17    public int get(int index) {
18        if (index < 0) {
19            return -1;
20        }
21
22        int count = 0;
23        Node curr = head;
24
25        while (curr != null) {
26            if (count == index) {
27                return curr.val;
28            }
29
30            count++;
31            curr = curr.next;
32        }
33
34        return -1;
35    }
36
37    public void addAtHead(int val) {
38        Node node = new Node(val);
39        node.next = head;
40        head = node;
41    }
42
43    public void addAtTail(int val) {
44        Node node = new Node(val);
45
46        if (head == null) {
47            head = node;
48            return;
49        }
50
51        Node curr = head;
52        while (curr.next != null) {
53            curr = curr.next;
54        }
55
56        curr.next = node;
57    }
58
59    public void addAtIndex(int index, int val) {
60        if (index < 0) return;
61
62        if (index == 0) {
63            addAtHead(val);
64            return;
65        }
66
67        int count = 0;
68        Node curr = head;
69
70        while (curr != null) {
71            if (count == index - 1) {
72                Node node = new Node(val);
73                node.next = curr.next;
74                curr.next = node;
75                return;
76            }
77            count++;
78            curr = curr.next;
79        }
80    }
81
82    public void deleteAtIndex(int index) {
83        if (index < 0 || head == null) return;
84
85        if (index == 0) {
86            head = head.next;
87            return;
88        }
89
90        int count = 0;
91        Node curr = head;
92
93        while (curr != null) {
94            if (count == index - 1) {
95                if (curr.next != null) {      
96                    curr.next = curr.next.next;
97                }
98                return;                           
99            }
100            count++;
101            curr = curr.next;
102        }
103    }
104}
105