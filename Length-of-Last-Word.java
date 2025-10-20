class Solution {
    public int lengthOfLastWord(String s) {

        int n = s.length();
        if(n == 1) {
            return 1;
        }
        
         char[] newWord = s.toCharArray();

         boolean isWordMet = false;
         int startIndex = -1; 
         int endIndex = -1;

         for(int i = n - 1; i >= 0 ; i--) {
            char c = newWord[i];
            if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                if(!isWordMet) {
                    endIndex = i;
                    isWordMet = true;
                }
            }

            if(isWordMet && c == ' ') {
                startIndex = i++;
                break;
            }
         }

        return (endIndex - startIndex) ;
    }
}