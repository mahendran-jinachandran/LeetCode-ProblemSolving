class Solution {
    public int[] plusOne(int[] digits) {
        
        int n = digits.length - 1;
        int carry = 0;
        ArrayList<Integer> newArray = new ArrayList<Integer>();

        for(int i = n; i >= 0; i--) {
            
            int sum = 0;
            if(i == n) {
                sum = digits[i] + 1;
            } else {
                sum = digits[i] + carry;
            }
            
            newArray.add(sum % 10);      
            carry = (sum >= 10) ? 1 : 0; 
        }

        if(carry == 1) {
            newArray.add(1);
        }

        Collections.reverse(newArray);

        int[] ans = new int[newArray.size()];
        for (int i = 0; i < newArray.size(); i++) {
            ans[i] = newArray.get(i);
        }
        return ans;
    }
}