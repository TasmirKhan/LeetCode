class Solution {
    public int[][] generateMatrix(int n) {
        int cnt = 0;
        int[][] arr = new int[n][n];
        int top = 0 , left = 0, bottom = n-1, right = n-1;
        while(top <= bottom && left <= right){

            for(int col = left ; col <= right ; col++){
                arr[top][col] = ++cnt;                
            }            
            top++;

            for(int row = top ; row <= bottom ; row++){
                arr[row][right] = ++cnt;                
            }            
            right--;

            if(top <= bottom){
                for(int col = right; col >= left ; col--){
                        arr[bottom][col] = ++cnt;                        
                }                
                bottom--;
            }

            if(left <= right){
                for(int row = bottom ; row >= top ; row--){
                    arr[row][left] = ++cnt;                    
                }                
                left++;

            }
        }

        return arr;
    }
}