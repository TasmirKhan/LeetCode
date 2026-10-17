class Solution {
    public static int smoother(int i , int j , int[][] img, int row, int col){
        int sum = img[i][j];
        int cnt = 1;
        if(i-1 >= 0) { sum += img[i-1][j]; cnt++; }
        if(i+1 < row) { sum += img[i+1][j]; cnt++; }
        if(i-1 >= 0 && j-1 >= 0) { sum += img[i-1][j-1]; cnt++; }
        if(j-1 >= 0){ sum += img[i][j-1] ; cnt++; }
        if(i+1 < row && j-1 >= 0){ sum += img[i+1][j-1]; cnt++; }
        if(i-1 >= 0 && j+1 < col){ sum += img[i-1][j+1]; cnt++;}
        if(j+1 < col){ sum += img[i][j+1] ; cnt++; }
        if(i+1 < row && j+1 < col){ sum += img[i+1][j+1]; cnt++;}
        return (int) Math.floor(sum/cnt);
    }

    public int[][] imageSmoother(int[][] img) {
        int m = img.length;
        int n = img[0].length;
        int[][] resImg = new int[m][n];

        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j<n ; j++){
                resImg[i][j] = smoother(i, j, img, m, n);
            }
        }

        return resImg;
    }
}