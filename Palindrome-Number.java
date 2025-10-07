class Solution {
    public boolean isPalindrome(int x) {
        int original = x;
        int result = 0;
        while (x > 0) {
            result = (result * 10) + ( x % 10);
            x = x / 10;
        }

        return original == result;
    } 
}

// temp = 1, result = 10, x = 12
// temp = 2, result = 20