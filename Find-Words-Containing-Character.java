1class Solution {
2    public List<Integer> findWordsContaining(String[] words, char x) {
3        List<Integer> result = new ArrayList<Integer>();
4        int n = words.length;
5
6        for(int i = 0; i < n; i++) {
7            if(words[i].indexOf(x) != -1) {
8                result.add(i);
9            }
10        }
11
12        return result;
13    }
14}