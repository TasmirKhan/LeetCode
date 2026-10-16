class Solution {
    // Matrix Simulation Helper method
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
        // Approach 1. ShortTrick using checking current index land and previous row and col (neighbour)
        int iland = 0;
        int nb = 0;
        for(int i = 0 ; i < grid.length ; i++){
            for(int j = 0 ; j < grid[0].length ; j++){
                if(grid[i][j] == 1){
                    iland++;

                    if(i > 0 && grid[i-1][j] == 1){ nb++; }
                    if(j > 0 && grid[i][j-1] == 1){ nb++; } 
                
              }
            }
        }
        return iland*4 - nb*2;





        // Approach 2. MATRIX SIMULATION
        // int row = grid.length;
        // int col = grid[0].length;
        // int res = 0;

        // for(int i = 0 ; i< row ; i++){
        //     for(int j = 0 ; j < col ; j++){
        //         if(grid[i][j] == 1){
        //             res += helper(grid, i, j);
        //         }
        //     }
        // }
        // return res;
    }
}