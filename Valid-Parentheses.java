class Solution {

    

    public boolean isValid(String s) {
        Stack<Character> parantheses = new Stack<Character>();


        for(int i=0; i<s.length(); i++) {
            if (!parantheses.empty() && ((parantheses.peek() == '(' && s.charAt(i) == ')') || 
               (parantheses.peek() == '{' && s.charAt(i) == '}') ||
               (parantheses.peek() == '[' && s.charAt(i) == ']')
            )) {

                parantheses.pop();

            } else {
               parantheses.push(s.charAt(i)); 
            }
        }

        return parantheses.empty();
    }
}