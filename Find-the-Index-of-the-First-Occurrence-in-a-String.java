class Solution {
    public int strStr(String haystack, String needle) {
        
        int indexFound = -1;
        for(int i=0; i < haystack.length(); i++) {

            if(needle.charAt(0) == haystack.charAt(i)) {

                int haystackIndex = i;
                indexFound = haystackIndex;
                for(int j=0; j<needle.length(); j++) {
                    if(haystackIndex < haystack.length() && (needle.charAt(j) == haystack.charAt(haystackIndex))) {
                        haystackIndex++;
                    } else {
                        indexFound = -1;
                        break;
                    }

                    if (j == needle.length() - 1) {
                        return indexFound;
                    }
                }
            }
        }

        return indexFound;
    }
}