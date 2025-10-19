class Solution {

    public int[][] flipAndInvertImage(int[][] image) {
        
        int n = image.length;
        for(int i = 0; i < n; i++) {

            int z = image[i].length - 1;
            int j = 0;
            while(j < z) {
                int temp = image[i][j];
                image[i][j] = image[i][z];
                image[i][z] = temp;
                image[i][j] = image[i][j]^1;
                image[i][z] = image[i][z]^1;
                j++;
                z--;
            }

            if(j == z) {
                image[i][j] = image[i][j]^1;
            }
        }

        return image;
    }
}