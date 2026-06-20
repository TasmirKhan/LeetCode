class Solution {

    public static void revArr(int[]arr){
       int n = arr.length, low = 0 , high = n-1;
        while(low<=high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] dup = new int[n][n];

        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j<i ; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        } 
        for(int i = 0 ; i<n ; i++){
           revArr(matrix[i]);
        }


        // matrix = dup; why can't we achieve through it.
    }
}