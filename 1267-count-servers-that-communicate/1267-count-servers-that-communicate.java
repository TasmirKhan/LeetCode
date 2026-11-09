class Solution {
    public int countServers(int[][] grid) {
        int row = grid.length, col = grid[0].length;
        int[] rowarr = new int[row];
        int[] colarr = new int[col];
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ; j++){
                if(grid[i][j] == 1){
                    rowarr[i]++;
                    colarr[j]++;
                }
            }
        }

        int ans = 0;

        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ; j++){
                if(grid[i][j] == 1 && (rowarr[i] > 1 || colarr[j] > 1)){
                    ans++;
                }
            }
        }
        return ans;
    }
}