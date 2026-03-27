1class Solution {
2    public String interpret(String command) {
3        StringBuilder result = new StringBuilder();
4
5        int n = command.length();
6        for (int i = 0; i < n; i++) {
7            if (command.charAt(i) == 'G') {
8                result.append("G");
9            } 
10            else if (command.charAt(i) == '(') {
11                if (command.charAt(i + 1) == ')') {
12                    result.append("o");
13                    i++; 
14                } else {
15                    result.append("al");
16                    i += 3;
17                }
18            }
19        }
20
21        return result.toString();
22    }
23}