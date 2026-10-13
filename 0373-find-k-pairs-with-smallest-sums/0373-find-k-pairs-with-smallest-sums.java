class Solution {


    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {

        PriorityQueue<int[]> que = new PriorityQueue<>((a,b)->a[0]+a[1]-b[0]-b[1]);
        List<List<Integer>> res = new ArrayList<>();
        if(nums1.length==0 || nums2.length==0 || k==0) return res;
        for(int i=0; i<nums1.length && i<k; i++) que.offer(new int[]{nums1[i], nums2[0], 0});
        while(k-- > 0 && !que.isEmpty()){
            int[] cur = que.poll();
            res.add(new ArrayList<>(List.of(cur[0], cur[1])));
            if(cur[2] == nums2.length-1) continue;
            que.offer(new int[]{cur[0],nums2[cur[2]+1], cur[2]+1});
        }
        return res;
    
        //       // PriorityQueue Approach
        // int n = nums1.length;
        // int m = nums2.length;
        // PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> Integer.compare(b[0], a[0]));
        // List<List<Integer>> lst = new ArrayList<>();
        // for(int i = 0 ; i < n ; i++){
        //     int x = nums1[i];
        //     for(int j = 0 ; j<m ; j++){
        //         int y = nums2[j];
        //         int sum = x + y;
        //         if(pq.size() > k){
        //             if(pq.peek()[0] > sum){
        //                 pq.poll();
        //                 pq.add(new int[]{sum, x,y});
        //             }
        //         }
        //         else{ pq.add(new int[]{sum, x,y});}
        //     }
            
        // }

        // PriorityQueue<int[]> pq2 = new PriorityQueue<>((a,b) -> Integer.compare(a[0],b[0]));

        // while(!pq.isEmpty()){
        //     int[] temp = pq.poll();
        //     pq2.add(temp);
        // }


        // while( k-- > 0){
        //     int[] arr = pq2.poll();
        //     List<Integer> lst2 = new ArrayList<>();
        //     lst2.add(arr[1]);
        //     lst2.add(arr[2]);
        //     lst.add(lst2);
        // }

        // return lst;
    }
}