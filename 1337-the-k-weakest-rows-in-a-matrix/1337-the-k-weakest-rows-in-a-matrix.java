class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
         int m = mat.length;
         int n = mat[0].length;
         
         PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)-> {if(a[0] == b[0]){return Integer.compare(a[1],b[1]);} else {return Integer.compare(a[0],b[0]);} });

         for(int i = 0 ; i<m ; i++){
            int low = 0;
            int high = n-1;
            int sol = 0;
            while(low <= high){
                int mid = low + (high-low)/2;
                if(mat[i][mid] == 1){
                    low = mid+1;
                }
                else{ high = mid-1; }
            }
            sol = low+1;
            pq.add(new int[]{sol,i});
         }

         int[] res = new int[k];
         int i = 0;
         while(i<k){
            int[] arr = pq.poll();
            res[i] = arr[1];
            i++; 
         }
        return res;
    }
}