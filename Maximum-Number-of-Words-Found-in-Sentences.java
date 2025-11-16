class Solution {
    public int mostWordsFound(String[] sentences) {
        
        int maximum = 0;
        for(int i=0; i<sentences.length; i++) {

            int count = 1;
            String sentence = sentences[i];
            int n = sentence.length();
            for(int j = 0; j < n; j++) {
                if(sentence.charAt(j) == ' ') {
                    count++;
                }
            }

            maximum = Math.max(maximum, count);
        }

        return maximum;
    }
}