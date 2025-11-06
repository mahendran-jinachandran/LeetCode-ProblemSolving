class Solution {
    public int myAtoi(String s) {

        int i = 0;
        int n = s.length();
        while(i < n && s.charAt(i) == ' ') {
            i++;
        }

        if(i >= n) {
            return 0;
        }

        boolean sign = true;
        if(s.charAt(i) == '-') {
            sign = false;
            i++;
        } else if(s.charAt(i) == '+') {
            i++;
        }

        int finalAnswer = 0;

        while(i < n && s.charAt(i) >= '0' 
               						&& s.charAt(i) <= '9') {

            if (finalAnswer > Integer.MAX_VALUE / 10 || 
                   (finalAnswer == Integer.MAX_VALUE / 10 && s.charAt(i) - '0' > 7)) {
                return sign == true ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
          
            finalAnswer = 10 * finalAnswer + (s.charAt(i++) - '0');
        }

        return sign == true ? finalAnswer : -finalAnswer;
    }
}