class Solution {
    public int findKthLargest(int[] nums, int k) {


        // 1. Using PriorityQueue
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0 ; i < nums.length ; i++){
            pq.add(nums[i]);
            if(pq.size() > k){
                pq.poll();
            }
        }
        // while(k-- > 1){
        //     pq.poll();
        // }
        return pq.poll();

        //2. Using Sorting 
        // Arrays.sort(nums);
        // return nums[nums.length-k];
        
    }
}