class Solution {
    public int strStr(String haystack, String needle) {
        
        int positionIndex = 0;
        int hayStackLength = haystack.length();
        int needleLength = needle.length();
        for(int i=0; i < hayStackLength; i++){
            if(haystack.charAt(i)==needle.charAt(positionIndex)){
                positionIndex++;
            }
            else{
                i = i - positionIndex;
                positionIndex=0;
            }

            if(positionIndex == needleLength){
                return i - needleLength + 1;
            }
        }

        return -1;
    }
}