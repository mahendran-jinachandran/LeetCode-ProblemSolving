1class Solution {
2
3    public int calPoints(String[] operations) {
4        
5        Stack<String> op = new Stack<>();
6
7        for(String o: operations) {
8
9            if(o.equals("+")) {
10                int firstValue = Integer.parseInt(op.pop());
11                int secondValue = Integer.parseInt(op.pop());
12                int finalValue = firstValue + secondValue;
13                op.push(Integer.toString(secondValue));
14                op.push(Integer.toString(firstValue));
15                op.push(Integer.toString(finalValue));       
16            } else if(o.equals("D")) {
17                int doubleValue = Integer.parseInt(op.peek()) * 2;
18                op.push(Integer.toString(doubleValue));
19            } else if(o.equals("C")) {
20                op.pop();
21            } else {
22                op.push(o);
23            }
24        }
25
26        int sum = 0;
27        while(!op.isEmpty()) {
28             sum += Integer.parseInt(op.pop());
29        }
30
31        return sum;
32    }
33}