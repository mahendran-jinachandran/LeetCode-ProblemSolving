class Solution {

    public int flipBit(int bit) {
        return bit == 0 ? 1 : 0;
    }
    public int[][] flipAndInvertImage(int[][] image) {
        
        for(int i = 0; i < image.length; i++) {

            int z = image[i].length - 1;
            int j = 0;
            while(j < z) {
                int temp = image[i][j];
                image[i][j] = image[i][z];
                image[i][z] = temp;
                image[i][j] = flipBit(image[i][j]);
                image[i][z] = flipBit(image[i][z]);
                j++;
                z--;
            }

            if(j == z) {
                image[i][j] = flipBit(image[i][j]);
            }
        }

        return image;
    }
}