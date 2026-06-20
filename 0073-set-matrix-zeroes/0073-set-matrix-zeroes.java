class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int []row = new int[m];
        int []col = new int[n];

        for(int i = 0 ; i<m ; i++){
            for(int j = 0 ; j<n ; j++){
                if(matrix[i][j] ==0){
                    row[i] = 1; 
                    col[j] = 1;
                }
            }
        }
        for(int i = 0 ; i<m ; i++){
            for(int j = 0 ; j<n ; j++){
                if(row[i] == 1 || col[j] ==1){
                    matrix[i][j] =0;
                } 
            }
        }
        // for(int i =0 ;i<matrix.length ; i++){
        //     for(int j =0 ; j<matrix[0].length ; j++){
        //         if(matrix[i][j] == 0){
        //             for(int row = 0 ; row<matrix.length ; row++){
        //                 if(matrix[row][j] != 0){
        //                     matrix[row][j] = -1;
        //                 }
        //             }
                    
        //             for(int col = 0 ; col<matrix[0].length ; col++){
        //                 if(matrix[i][col] != 0){
        //                     matrix[i][col] = -1;
        //                 }
        //             }
        //         }
        //     }
        // }

        // for(int i = 0 ; i<matrix.length ; i++){
        //     for(int j = 0 ; j<matrix[0].length ; j++){
        //         if(matrix[i][j] == -1) matrix[i][j] =0;
        //     }
        // }
    }
}