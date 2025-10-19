class Solution {
    public String restoreString(String s, int[] indices) {

        int n = s.length();
        char[] newString = new char[n];

        for(int i = 0; i < n; i++) {
            newString[indices[i]] = s.charAt(i);
        }

        return new String(newString);
    }
}