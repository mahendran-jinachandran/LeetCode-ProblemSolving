class Solution {

    

    public boolean isValid(String s) {
        Character[] parantheses = new Character[s.length()];
        int stackIndex = 0;

        for(int i=0; i<s.length(); i++) {
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