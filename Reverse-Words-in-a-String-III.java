class Solution {


    public String reverseWords(String s) {
        
        char[] newWord = s.toCharArray();
        int i = 0;
        int j = 0;
        while(i < s.length()) {
            if(newWord[j] == ' ' || j == s.length() - 1) {
                
                int z = 0;
                if(newWord[j] == ' ') {
                    z = j - 1;
                } else {
                    z = j;
                }

                while(i < z) {
                    char temp = newWord[i];
                    newWord[i] = newWord[z];
                    newWord[z] = temp;
                    i++;
                    z--;
                }

                i = j + 1;
            }

            j++;
        }

        return new String(newWord);
    }
}