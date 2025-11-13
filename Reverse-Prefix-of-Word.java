class Solution {
    public String reversePrefix(String word, char ch) {
        char[] ans = word.toCharArray();
        int start = 0;
        int end = 0;
        int n = word.length();
        for(int i = 0; i < n ; i++) {
            if(ans[i] == ch) {
                end = i;
                break;
            }
        }

        while(start < end) {
            char temp = ans[start];
            ans[start++] = ans[end];
            ans[end--] = temp;
        }

        return new String(ans);
    }
}