class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> outer = new ArrayList<List<Integer>>();
        for (int row = 1; row <= numRows; row++) {
          
            // nC0 = 1
            List<Integer> inner = new ArrayList<Integer>();
            int c = 1;
            for (int i = 1; i <= row; i++) {

                // The first value in a row is always 1
                inner.add(c);
                c = c * (row - i) / i;
            }
            
            outer.add(inner);
        }

        return outer;
    }
}