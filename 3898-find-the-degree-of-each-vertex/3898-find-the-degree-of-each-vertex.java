class Solution {
    public int[] findDegrees(int[][] matrix) {
        int n = matrix.length;
        int[] res = new int[n];
        int x = 0;
        for(int[] temp : matrix){
            int cnt = 0;
            for(int t : temp){
                cnt += t;
            }
            
            res[x] = cnt;
            x++;
        }
        return res;

    }
}