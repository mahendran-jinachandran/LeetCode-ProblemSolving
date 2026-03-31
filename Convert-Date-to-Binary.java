1class Solution {
2
3    private String toBinary(int decimal) {
4        if (decimal == 0) return "0";
5
6        StringBuilder result = new StringBuilder();
7
8        while (decimal > 0) {
9            int bit = decimal % 2;
10            result.append(bit);
11            decimal /= 2;
12        }
13
14        return result.reverse().toString();
15    }
16
17    public String convertDateToBinary(String date) {
18
19        int i = 0;
20        int n = date.length();
21        StringBuilder binaryDate = new StringBuilder();
22
23        while (i < n) {
24
25            int decimalValue = 0;
26
27            while (i < n && date.charAt(i) != '-') {
28                decimalValue = decimalValue * 10 + (date.charAt(i) - '0');
29                i++;
30            }
31
32            binaryDate.append(toBinary(decimalValue));
33
34            if (i < n) {
35                binaryDate.append("-");
36                i++;
37            }
38        }
39
40        return binaryDate.toString();
41    }
42}