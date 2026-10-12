class Solution {
    public static int findMin(int[] arr){
        int min = Integer.MAX_VALUE;
        int idx = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] < min){
                min = arr[i];
                idx = i;
            }
        }
        return idx;
    }
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        
        while(k-- > 0){
            int i = findMin(nums);
            nums[i] = nums[i]*multiplier;
        }
        return nums;
        // PriorityQueue Approach 
        // PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> {
        //     if(a[0] != b[0]){
        //         return Integer.compare(a[0], b[0]);
        //     }
        //     else{
        //         return Integer.compare(a[1], b[1]);
        //     }
        // });

        // for(int i = 0 ; i < nums.length ; i++){
        //     pq.add(new int[]{nums[i], i});
        // }

        // while(k-- > 0){
        //     int[] arr = pq.poll();
        //     int value = arr[0];
        //     int idx = arr[1];

        //     value = multiplier * value;
        //     pq.add(new int[]{value, idx});          
        // }

        // while(!pq.isEmpty()){
        //     int[] arr = pq.poll();
        //     int idx = arr[1];
        //     int value = arr[0];

        //     nums[idx] = value;
        // }

        // return nums;
    }
}