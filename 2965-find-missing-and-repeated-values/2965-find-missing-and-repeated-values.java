class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int m = grid.length;
        int n = m*m;

        int[] freq = new int[n+1];

        int missing = -1;
        int repeating = -1;
        int sum = 0;
        int nsum = (n*(n+1))/2;

        for(int[] x : grid ){
            for(int y : x){
                freq[y]++;
                if(freq[y] == 2){ repeating = y;}
                sum += y;
            }
        }

        missing = nsum - sum + repeating;

        return new int[] {repeating,missing};


        // HashMap<Integer,Integer> set = new HashMap<>();
        // int sum = 0;
        // int n = grid.length * grid.length;
        // int nsum = (n*(n+1))/2;
        // for(int i = 0 ; i<grid.length ; i++){
        //     for(int j = 0 ; j<grid[0].length; j++){
        //         set.put(grid[i][j], set.getOrDefault(grid[i][j], 0)+1);
        //         sum += grid[i][j];
        //     }
        // }
        // int repeating = 0;
        // for(int x  : set.keySet()){
        //     if(set.get(x) >= 2){ repeating = x; break;}
        // }
        // int missing = nsum - sum + repeating;
        // return new int[] {repeating,missing};
    }
}