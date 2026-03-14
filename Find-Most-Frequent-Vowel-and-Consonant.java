1class Solution {
2    public int maxFreqSum(String s) {
3        
4        int n = s.length();
5        int[] characters = new int[26];
6        for(int i = 0; i < n; i++) {
7            characters[s.charAt(i) - 'a']++;
8        }
9
10        int vowelMax = 0;
11        int consonantsMax = 0;
12        for(int i = 0; i < 26; i++) {
13            if(i == 0 || i == 4 || i == 8 || i == 14|| i == 20) {
14                if(characters[i] > vowelMax) {
15                    vowelMax = characters[i];
16                }
17            } else {
18                if(characters[i] > consonantsMax) {
19                    consonantsMax = characters[i];
20                }
21            }
22        }
23
24        return vowelMax + consonantsMax;
25    }
26}