1class Solution {
2    public String defangIPaddr(String address) {
3        
4        StringBuilder result = new StringBuilder();
5        int n = address.length();
6
7        for(int i = 0; i < n; i++) {
8            if(address.charAt(i) == '.') {
9                result.append("[.]");
10            } else {
11                result.append(address.charAt(i));
12            }
13        }
14
15        return new String(result);
16    }
17}