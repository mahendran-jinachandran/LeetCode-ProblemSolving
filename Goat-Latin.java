1class Solution {
2    public String toGoatLatin(String sentence) {
3        String[] words = sentence.split(" ");
4
5        StringBuilder result = new StringBuilder();
6        StringBuilder aString = new StringBuilder();
7        int n = words.length;
8
9        for(int i = 0; i < n; i++) {
10            String word = words[i];
11
12            if(isVowel(word.charAt(0))) {
13                result.append(word);
14            } else {
15                result.append(word.substring(1));
16                result.append(word.charAt(0));
17            }
18
19            result.append("ma");
20            aString.append("a");
21            result.append(aString);
22
23            if (i != words.length - 1) {
24                result.append(" ");
25            }
26        } 
27
28        return result.toString();
29    }
30
31    boolean isVowel(char ch) {
32        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
33               ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
34    }
35}