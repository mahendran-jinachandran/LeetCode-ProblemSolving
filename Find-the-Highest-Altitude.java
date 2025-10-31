class Solution {
    public int largestAltitude(int[] gain) {
        
        int maximum = 0;
        int altitude = 0;
        for(int i: gain) {
            altitude += i;

            if(altitude >= maximum) {
                maximum = altitude;
            }
        }

        return maximum;
    }
}