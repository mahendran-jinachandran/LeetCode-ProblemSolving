class Solution {


    public String reverseWords(String s) {
        
        char[] newWord = s.toCharArray();
        int i = 0;
        int j = 0;
        int n = s.length();
        while(i < n) {
            if(newWord[j] == ' ' || j == n - 1) {
                
                int z = 0;
                if(newWord[j] == ' ') {
                    z = j - 1;
                } else {
                    z = j;
                }

                while(i < z) {
                    char temp = newWord[i];
                    newWord[i++] = newWord[z];
                    newWord[z--] = temp;
                }

                i = j + 1;
            }

            j++;
        }

        return new String(newWord);
    }
}