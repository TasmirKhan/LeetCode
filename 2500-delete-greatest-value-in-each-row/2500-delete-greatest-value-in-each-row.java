class Solution {
    public int deleteGreatestValue(int[][] grid) {

        // Array Simulation + Sorting
        int row = grid.length;
        int col = grid[0].length - 1;

        for(int i = 0 ; i < row ; i++){
            Arrays.sort(grid[i]);
        }

        int sum = 0;
        while(col >= 0){
            int max = Integer.MIN_VALUE;
            int i  = 0;
            while(i < row){
                max = Math.max(max, grid[i][col]);
                i++;
            }
            sum += max;
            col--;
        }

        return sum;


        // Priority Queue Approach
        // int row = grid.length - 1;
        // int col = grid[0].length - 1;

        // ArrayList<PriorityQueue<Integer>> lst = new ArrayList<>();
        // for(int i = 0 ; i <= row ; i++){
        //     PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        //     int j = 0;
        //     while(j <= col){
        //         pq.add(grid[i][j]);
        //         j++;
        //     }
        //     lst.add(pq);
        // }

        // int n = lst.size();
        // int i = 0;
        // int sum = 0;
        // while(i <= col){
        //     int max = Integer.MIN_VALUE;
        //     for(int j = 0 ; j < n ; j++){
        //         PriorityQueue<Integer> temppq = lst.get(j);
        //         if(!temppq.isEmpty()){
        //         int x = temppq.poll();
        //         max = Math.max(max,x);}
        //     }
        //     sum += max;
        //     i+=1;
        // }

        // return sum ;
        
    }
}