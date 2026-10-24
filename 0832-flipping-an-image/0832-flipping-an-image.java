class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int row = image.length;
        int col = image[0].length;
        for(int i = 0 ; i < row ; i++){
            int low = 0;
            int high = col-1;
            while(low <= high){
                int temp = image[i][low];
                image[i][low] = image[i][high];
                image[i][high] = temp;

                if(image[i][low] == 0){image[i][low] = 1;}
                else{image[i][low] = 0;}

                if(low != high){
                if(image[i][high] == 0){image[i][high] = 1;}
                else{image[i][high] = 0;}
                }
                low++; high--;

            }

        }
        return image;
    }
}