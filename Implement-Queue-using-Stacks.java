1class MyQueue {
2
3    private Stack<Integer> input;
4    private Stack<Integer> output;
5
6    public MyQueue() {
7       input = new Stack<>();
8       output = new Stack<>();
9    }
10    
11    public void push(int x) {
12        input.push(x);
13    }
14    
15    public int pop() {
16        moveIfNeeded();
17        return output.pop();
18    }
19    
20    public int peek() {
21        moveIfNeeded();
22        return output.peek();
23    }
24    
25    public boolean empty() {
26        return input.isEmpty() && output.isEmpty();
27    }
28
29    private void moveIfNeeded() {
30        if(output.isEmpty()) {
31            while(!input.isEmpty()) {
32                output.push(input.pop());
33            }
34        }
35    }
36}
37
38/**
39 * Your MyQueue object will be instantiated and called as such:
40 * MyQueue obj = new MyQueue();
41 * obj.push(x);
42 * int param_2 = obj.pop();
43 * int param_3 = obj.peek();
44 * boolean param_4 = obj.empty();
45 */