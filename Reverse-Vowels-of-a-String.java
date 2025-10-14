class Solution {

    public boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
               c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }

    public String reverseVowels(String s) {
        
        char[] word = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;

        while(i < j) {
            if(!isVowel(word[i])) {
                i++;
            }

            if(!isVowel(word[j])) {
                j--;
            }

            if(isVowel(word[i]) && isVowel(word[j])) {
                char temp = word[i];
                word[i++] = word[j];
                word[j--] = temp;
            }
        }
        
        return new String(word);
    }
}