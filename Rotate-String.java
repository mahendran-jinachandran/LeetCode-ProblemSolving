class Solution {
    public boolean rotateString(String s, String goal) {
        
        int n = s.length();
        for(int i = 1; i <= n; i++) {
            if(s.equals(goal)) { return true; }
            s = s.charAt(n - 1) + s.substring(0, n - 1);
        }

        return false;
    }
}