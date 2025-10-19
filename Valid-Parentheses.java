class Solution {

    

    public boolean isValid(String s) {
        Character[] parantheses = new Character[s.length()];
        int stackIndex = 0;
        int n = s.length();
        for(int i=0; i<n; i++) {
            if (!(stackIndex==0) && ((parantheses[stackIndex - 1] == '(' && s.charAt(i) == ')') || 
               (parantheses[stackIndex - 1] == '{' && s.charAt(i) == '}') ||
               (parantheses[stackIndex - 1] == '[' && s.charAt(i) == ']')
            )) {

                parantheses[stackIndex] = '$';
                stackIndex--;

            } else {
               parantheses[stackIndex] = s.charAt(i);
               stackIndex++;
            }
        }

        return stackIndex==0;
    }
}