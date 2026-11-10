class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> lst = new ArrayList<>();
        int row = matrix.length;
        int col = matrix[0].length;

        List<int[][]> rowlst = new ArrayList<>();
        for(int i = 0 ; i < row ; i++){
            int[][] temp = new int[1][3];
            int min = Integer.MAX_VALUE;
            for(int j = 0 ; j < col ; j++){
                if(matrix[i][j] < min){
                    min = matrix[i][j];
                    temp[0][0] = min;
                    temp[0][1] = i;
                    temp[0][2] = j;
                }               
            }
            rowlst.add(temp);
        }

        for(int k = 0 ; k < rowlst.size() ; k++){
            int[][] temp = rowlst.get(k);
            int val = temp[0][0]; 
            int i  = temp[0][1];
            int j = temp[0][2];
            boolean sig = true;
            for(int x = 0 ; x < row; x++){
                if(val < matrix[x][j]) {sig = false; break; }
            }
            if(sig) lst.add(val);
        }

        return lst;


    }
}