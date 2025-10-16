class Solution {
    public int hammingWeight(int n) {
        
        StringBuilder binaryString = new StringBuilder();
        int numberOfOnes = 0;
        while(n > 0) {
            int bit = n % 2;
            binaryString.append((char) '0' + bit);
            n /= 2;

            if(bit == 1) { numberOfOnes++; }
        }

        binaryString.reverse();
        return numberOfOnes;

    }
}