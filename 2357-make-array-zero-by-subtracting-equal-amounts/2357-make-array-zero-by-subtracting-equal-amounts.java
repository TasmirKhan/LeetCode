class Solution {
    public int minimumOperations(int[] nums) {
        // 1. Fixed Constraints approach;
        int[] arr = new int[101];
        int cnt = 0;

        for(int num : nums){
            arr[num]++;
        }

        for(int i = 1 ; i < 101 ; i++){
            if(arr[i] != 0) cnt++;
        }
        return cnt;


        // 2. Sorting approach
        // Arrays.sort(nums);
        // int n = nums.length;
        // int cnt = 0;
        // for(int i = n-1 ; i>0 ; i--){
        //     nums[i] = nums[i] - nums[i-1];
        // }  
        // for(int num : nums){
        //     if(num != 0) cnt++;
        // }
        // return cnt;



        // 3. Priority Queue Approach
        // PriorityQueue<Integer> pq = new PriorityQueue<>();
        // for(int num : nums){
        //     if(num != 0){ pq.add(num);}
        // }

        // int sum = 0;
        // int cnt = 0;

        // while(!pq.isEmpty()){
        //     int x = pq.poll();
        //     if(x-sum > 0){
        //         sum += (x-sum);
        //         cnt++;
        //     }
        // }
        // return cnt;

        
    }
}