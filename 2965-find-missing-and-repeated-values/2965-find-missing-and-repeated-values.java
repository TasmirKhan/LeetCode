class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashMap<Integer,Integer> set = new HashMap<>();
        int sum = 0;
        int n = grid.length * grid.length;
        int nsum = (n*(n+1))/2;
        for(int i = 0 ; i<grid.length ; i++){
            for(int j = 0 ; j<grid[0].length; j++){
                set.put(grid[i][j], set.getOrDefault(grid[i][j], 0)+1);
                sum += grid[i][j];
            }
        }
        int repeating = 0;
        for(int x  : set.keySet()){
            if(set.get(x) >= 2){ repeating = x; break;}
        }
        int missing = nsum - sum + repeating;
        return new int[] {repeating,missing};
    }
}