class Solution {

    public static int helper(int[][] grid, int i, int j){
        int side = 4;
        int m = grid.length;
        int n = grid[0].length;

        if(i-1 >= 0){ if(grid[i-1][j] == 1) side--; } 
        if(j-1 >= 0){ if(grid[i][j-1] == 1) side--; } 
        if(i+1 < m){ if(grid[i+1][j] == 1) side--; } 
        if(j+1 < n ){ if(grid[i][j+1] == 1) side--; } 

        return side;
        
    }

    public int islandPerimeter(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int res = 0;

        for(int i = 0 ; i< row ; i++){
            for(int j = 0 ; j < col ; j++){
                if(grid[i][j] == 1){
                    res += helper(grid, i, j);
                }
            }
        }
        return res;
    }
}