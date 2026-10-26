class Solution {
    long dfs(int[][] arr, int i, int j, int row, int col) {
        if (i >= row || j >= col || i < 0 || j < 0 || arr[i][j] <= 0){
            return 0;
        }
           

        long currsum = arr[i][j];
        arr[i][j] = 0;

        currsum += dfs(arr, i - 1, j, row, col);
        currsum += dfs(arr, i + 1, j, row, col);
        currsum += dfs(arr, i, j - 1, row, col);
        currsum += dfs(arr, i, j + 1, row, col);

        return currsum;
    }

    public int countIslands(int[][] grid, int k) {
        int cnt = 0;
        int row = grid.length, col = grid[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] > 0) {
                long sum = dfs(grid, i, j, row, col);
                    if (sum % k == 0) // if sum == 0 then it will become true how ?
                        cnt++;
                }
            }
        }

        return cnt;
    }
}