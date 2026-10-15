class Solution {
    public int kthSmallest(int[][] matrix, int k) {
       PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
       for(int i = 0 ; i < matrix.length ; i++){
        for(int j = 0 ; j<matrix[0].length ; j++){
            pq.add(matrix[i][j]);
        }
       }
       k = pq.size() - k;
       while(k>0){
        pq.poll(); k--;
       }

       return pq.peek();

    }
}