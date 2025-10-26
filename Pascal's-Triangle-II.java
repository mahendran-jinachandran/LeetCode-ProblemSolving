class Solution {
    public List<Integer> getRow(int rowIndex) {
        
        List<List<Integer>> outer = new ArrayList<List<Integer>>();
        for(int i = 1; i <= rowIndex + 1; i++) {
            
            long c = 1;
            List<Integer> inner = new ArrayList<Integer>();
            for(int j = 1; j <= i; j++) {
                inner.add((int)c);
                c = c * (i - j) / j;     
            }

            outer.add(inner);
        }

        return outer.get(rowIndex);
    }
}