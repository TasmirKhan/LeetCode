class Solution {
    public int[] arrayRankTransform(int[] arr) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> Integer.compare(a[0],b[0]));

        for(int i = 0 ; i<arr.length ; i++){
            pq.add(new int[]{arr[i], i});
        }

        int rank = 1;
        while(!pq.isEmpty()){
            int[] temp = pq.poll();
            int idx = temp[1];
            int val = temp[0];
            arr[idx] = rank;
            if( !pq.isEmpty() && val != pq.peek()[0]) rank++;
           
        }

        return arr;
    }
}