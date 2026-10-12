class Solution {
    public int[] numberGame(int[] nums) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int num : nums){
            pq.add(num);
        }

        int i = 0;
        while(!pq.isEmpty()){
            int y = pq.poll();
            int x = pq.poll();
            nums[i++] = x;
            nums[i++] = y;
        }

        return nums;
        // int n = nums.length;
        // int[] arr = new int[n];

        // Arirays.sort(nums);
        // for(int i = 0 ; i < n-1; i+=2){
        //     int temp = nums[i];
        //     nums[i] = nums[i+1];
        //     nums[i+1] = temp;
        // }

        // return nums;
    }
}