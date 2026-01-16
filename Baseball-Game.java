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
16                // System.out.println("+");
17                // op.forEach(System.out::println);
18                
19            } else if(o.equals("D")) {
20                int doubleValue = Integer.parseInt(op.peek()) * 2;
21                op.push(Integer.toString(doubleValue));
22                // System.out.println("D");
23                // op.forEach(System.out::println);
24            } else if(o.equals("C")) {
25                op.pop();
26                // System.out.println("C");
27                // op.forEach(System.out::println);
28            } else {
29                op.push(o);
30                // System.out.println("FINAL");
31                // op.forEach(System.out::println);
32            }
33        }
34
35        int sum = 0;
36        while(!op.isEmpty()) {
37            // System.out.println(op.pop());
38             sum += Integer.parseInt(op.pop());
39        }
40
41        return sum;
42    }
43}