class Solution {

    boolean isAlphaNumberic(char c) {
        return (c >= 65 && c <= 90) ||
           (c >= 97 && c <= 122) ||
           (c >= 48 && c <= 57);
    }

    public boolean isPalindrome(String s) {

        s = s.toLowerCase();
        if(s.isEmpty()) { return true; }
        
        int i = 0;
        int j = s.length() - 1;

        while(i <= j) {
            char firstLetter = s.charAt(i);
            if(!isAlphaNumberic(firstLetter)) {
                i++;
                continue;
            }

            char lastLetter = s.charAt(j);
            if(!isAlphaNumberic(lastLetter)) {
                j--;
                continue;
            }

            if(firstLetter != lastLetter) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}