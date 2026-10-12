class Solution {
    public int[] arrayRankTransform(int[] arr) {

        int n = arr.length;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));

        for(int i = 0 ; i<n ; i++){
            pq.add(new int[]{arr[i], i});
        }

        int rank = 1;
        

        while(!pq.isEmpty()){
            int[] temp = pq.poll();
            int idx = temp[1];
            int value = temp[0];
            arr[idx] = rank;
            if(!pq.isEmpty() && pq.peek()[0] == value){continue;}
            rank += 1;
        }

        return arr;

        // Sorting + HashMap Approach (O(nlogn))
        // int n = arr.length;
        // HashMap<Integer,Integer> map = new HashMap<>();
        // int[] x = arr.clone();
        // Arrays.sort(x);
        // int cnt = 1;
        // for(int i = 0 ; i<n ; i++){
        //     if(!map.containsKey(x[i])){
        //     map.put(x[i], cnt); cnt += 1; }
        // }

        // for(int i = 0 ; i<n ; i++){
        //     x[i] = map.get(arr[i]);
        // }

        // return x;

    }
}