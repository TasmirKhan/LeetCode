class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        ArrayList<Integer> lst = new ArrayList<>();

        int top = 0 , left = 0, bottom = matrix.length-1 , right = matrix[0].length-1;

        while(top <= bottom && left <= right){

            for(int col = left ; col <= right ; col++){
                lst.add(matrix[top][col]);
            }
            top++;

            for(int row = top ; row <= bottom ; row++){
                lst.add(matrix[row][right]);
            }
            right--;

            if(top <= bottom){
                for(int col = right ; col >= left; col--){
                    lst.add(matrix[bottom][col]);
                }
                bottom--;
            }

            if(left <= right){
                for(int row = bottom; row >= top; row--){
                    lst.add(matrix[row][left]);
                }
                left++;
            }

        }

        return lst;


        // List<Integer> lst = new ArrayList<>();
        // int top = 0 , left = 0, bottom = matrix.length, right = matrix[0].length;
        // int row = 0 , col = 0;
        // while(top < bottom && left < right){
        //     while(col < right ){
        //         lst.add(matrix[row][col]);
        //         col++;
        //     }
        //     top++;
        //     col--;
        //     row++;

        //     while(row < bottom){
        //         lst.add(matrix[row][col]);
        //         row++;
        //     }
        //     right--;
        //     row--;
        //     col--;

        //     if (top >= bottom || left >= right) {
        //         break;
        //     }

        //     while(col >= left){
        //         lst.add(matrix[row][col]);
        //         col--;
        //     }
        //     col++;
        //     row--;
        //     bottom--;

        //     if (top >= bottom || left >= right) {
        //         break;
        //     }

        //     while(row >= top){
        //         lst.add(matrix[row][col]);
        //         row--;
        //     }
        //     row++;
        //     col++;
        //     left++;

        // }
        // return lst;
    }
}