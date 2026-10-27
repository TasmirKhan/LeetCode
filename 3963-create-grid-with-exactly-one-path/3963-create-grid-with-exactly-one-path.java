class Solution {
    public String[] createGrid(int m, int n) {
        // Using Built-In method;
    
        char[][] g = new char[m][n];
        for (int i = 0; i < m; i++) {
            Arrays.fill(g[i], '#');
        }

        Arrays.fill(g[0], '.');

        for (int i = 0; i < m; i++) {
            g[i][n - 1] = '.';
        }

        String[] ans = new String[m];
        for (int i = 0; i < m; i++) {
            ans[i] = new String(g[i]);
        }
        return ans;
  
        // Building from scratch
        // int row = 0, col = 0;
        // int[][] arr = new int[m][n];
        // while(row < m && col < n){
        //     while(col < n){
        //         arr[row][col] = 1;
        //         col++;
        //     }
        //     row++;
        //     col--;
        //     while(row < m){
        //         arr[row][col] = 1;
        //         row++;
        //     }           
        // }

        // String[] res = new String[m];

        // for(int i = 0 ; i < m ; i++){
        //     StringBuilder sb = new StringBuilder();
        //     for(int j = 0; j < n; j++){
        //         if(arr[i][j] == 1) sb.append(".");
        //         else{ sb.append("#"); }
        //     }
        //     res[i] = sb.toString();
        // }
        // return res;
    }

}