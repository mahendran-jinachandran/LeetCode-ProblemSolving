class Solution {
    public int reverse(int x) {
        
        long answer = 0;
        boolean isNegative = false;
        if(x < 0) {
            x = Math.abs(x);
            isNegative = true;
        }

        while(x > 0) {
            int value = x % 10;
            answer = answer * 10 + value;
            x = x / 10;
        }

        if(answer > Integer.MAX_VALUE || answer < Integer.MIN_VALUE) {
            return 0;
        }

        return isNegative ?  (int) -answer : (int) answer;
    }
}