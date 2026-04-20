1class Solution {
2
3    
4
5    public boolean isValid(String s) {
6        Character[] parantheses = new Character[s.length()];
7        int stackIndex = 0;
8        int n = s.length();
9        for(int i=0; i<n; i++) {
10            if (!(stackIndex==0) && ((parantheses[stackIndex - 1] == '(' && s.charAt(i) == ')') || 
11               (parantheses[stackIndex - 1] == '{' && s.charAt(i) == '}') ||
12               (parantheses[stackIndex - 1] == '[' && s.charAt(i) == ']')
13            )) {
14
15                parantheses[stackIndex] = '$';
16                stackIndex--;
17
18            } else {
19               parantheses[stackIndex] = s.charAt(i);
20               stackIndex++;
21            }
22        }
23
24        return stackIndex==0;
25    }
26}