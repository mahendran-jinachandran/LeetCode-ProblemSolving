1class Solution {
2    public int evalRPN(String[] tokens) {
3        
4        Stack<String> evaluation = new Stack<>();
5
6
7
8        for(String token: tokens) {
9            if(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
10                
11                int secondOperand = Integer.parseInt(evaluation.pop());
12                int firstOperand = Integer.parseInt(evaluation.pop());
13
14                int result = 0;
15                if(token.equals("+")) {
16                    result = firstOperand + secondOperand;
17                } else if (token.equals("-")) {
18                    result = firstOperand - secondOperand;
19                } else if (token.equals("*")) {
20                    result = firstOperand * secondOperand;
21                } else {
22                    result = firstOperand / secondOperand;
23                }
24
25                evaluation.push(String.valueOf(result));
26            } else {
27                evaluation.push(token);
28            }
29        }
30
31        return Integer.parseInt(evaluation.pop());
32    }
33}