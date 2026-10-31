class Solution {
    public int[] findDegrees(int[][] matrix) {
        int n = matrix.length;
        int[] res = new int[n];
        int x = 0;
        for(int[] temp : matrix){
            int cnt = 0;
            for(int i = 0 ; i < temp.length ; i++){
                if(i != x && temp[i] == 1) cnt++;
            }
            res[x] = cnt;
            x++;
        }
        return res;

    }
}