class Solution {
    public int findKthLargest(int[] nums, int k) {
        // 1. Using PriorityQueue
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int num : nums){
            pq.add(num);
        }

        while(k-->1){
            pq.poll();
        }
        return pq.peek();

        //2. Using Sorting 
        // Arrays.sort(nums);
        // return nums[nums.length-k];
        
    }
}