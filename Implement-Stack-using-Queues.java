1class MyStack {
2
3    Queue<Integer> queue;
4    public MyStack() {
5        queue = new LinkedList<>();
6    }
7    
8    public void push(int x) {
9        queue.offer(x);
10
11        int size = queue.size();
12        for(int i = 0; i < size - 1; i++) {
13            queue.offer(queue.poll());
14        }
15    }
16    
17    public int pop() {
18        return queue.poll();
19    }
20    
21    public int top() {
22        return queue.peek();
23    }
24    
25    public boolean empty() {
26        return queue.isEmpty();
27    }
28}
29
30/**
31 * Your MyStack object will be instantiated and called as such:
32 * MyStack obj = new MyStack();
33 * obj.push(x);
34 * int param_2 = obj.pop();
35 * int param_3 = obj.top();
36 * boolean param_4 = obj.empty();
37 */