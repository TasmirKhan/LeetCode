class Solution {
   public int longestCommonSubsequence(String s1, String s2) {
       int m = s1.length();
       int n = s2.length();

       int[][] arr = new int[m+1][n+1];
       for(int i = 0 ; i<m+1; i++){
        arr[i][0] = 0;
       }

       for(int i = 0 ; i<n+1; i++){
        arr[0][i] = 0;
       }

       for(int i = 1; i<m+1 ; i++){
        for(int j = 1 ; j < n+1 ; j++){
            if(s1.charAt(i-1) == s2.charAt(j-1)){ arr[i][j] = 1 + arr[i-1][j-1];}
            else{
                arr[i][j] = Math.max(arr[i-1][j], arr[i][j-1]);
            }
        }
       }
       return arr[m][n];
    }
}