class Solution {
    private int[][] transpose(int[][] arr){
        int n = arr.length;
        for(int i = 0 ; i<n ; i++){
            for(int j = 0; j<i; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        return arr;
        }

        private int[][] reverse(int[][] arr){
            int n = arr.length;
            for(int i = 0 ; i<n ; i++){
                int low = 0 , high = n-1;
                while(low < high){
                    int temp = arr[i][low];
                    arr[i][low] = arr[i][high];
                    arr[i][high] = temp;
                    low++; high--;
                }
            }
            return arr;
        }
    
    public void rotate(int[][] matrix) {
        Solution obj = new Solution();
        matrix = obj.transpose(matrix);
        matrix = obj.reverse(matrix);
        
    }
}