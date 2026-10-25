class Solution {
    void dfs(int[][] arr, int a , int i){ // a = row, i = col
        if(arr[a][i] == 1) return ;
        arr[a][i] = 1;
        
        if(a > 0) dfs(arr, a-1, i);
        if(a < arr.length -1) dfs(arr, a+1,i);
        if(i > 0) dfs(arr, a, i-1);
        if(i < arr[0].length - 1) dfs(arr, a , i+1);

    }

     void borderSettle(int[][] grid, int a, boolean row){
        if(row){
            for(int i = 0 ; i < grid[0].length ; i++){
                dfs(grid,a,i);
            }
        }
        else{
            for(int i = 0 ; i < grid.length ; i++){
                dfs(grid, i, a);
            }
        }
    }
    public int closedIsland(int[][] grid) {
        // checking border
        int row = grid.length , col = grid[0].length;
        borderSettle(grid, 0, true);
        borderSettle(grid, 0, false);
        borderSettle(grid, row-1, true);
        borderSettle(grid, col -1, false);

        int cnt = 0;
        for(int i = 1 ; i < row-1 ; i++){
            for(int j = 1 ; j < col-1 ; j++){
                if(grid[i][j] == 0){
                    cnt++;
                    dfs(grid,i,j);
                }
            }
        }
        return cnt;
    }
}