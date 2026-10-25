class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> lst = new ArrayList<>();
        int top = 0 , left = 0, bottom = matrix.length, right = matrix[0].length;
        int row = 0 , col = 0;
        while(top < bottom && left < right){
            while(col < right ){
                lst.add(matrix[row][col]);
                col++;
            }
            top++;
            col--;
            row++;

            while(row < bottom){
                lst.add(matrix[row][col]);
                row++;
            }
            right--;
            row--;
            col--;

            if (top >= bottom || left >= right) {
                break;
            }

            while(col >= left){
                lst.add(matrix[row][col]);
                col--;
            }
            col++;
            row--;
            bottom--;

            if (top >= bottom || left >= right) {
                break;
            }

            while(row >= top){
                lst.add(matrix[row][col]);
                row--;
            }
            row++;
            col++;
            left++;

        }
        return lst;
    }
}