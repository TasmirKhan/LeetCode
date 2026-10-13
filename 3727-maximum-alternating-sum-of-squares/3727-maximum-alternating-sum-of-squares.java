class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        int k = n/2;

        Arrays.sort(nums);

        int i = 0 ;
        int j = nums.length-1;
        long sum = 0;

        while(j-i >= k){
            if(Math.abs(nums[j]) > Math.abs(nums[i])){
                int x = Math.abs(nums[j--]);
                sum += x*x;
            }
            else{
                int y = Math.abs(nums[i++]);
                sum += y*y;
            }
        }

        while(i<=j){            
            sum -= (nums[i] * nums[i]);
            i++;
        }
        return sum ;
        // Priority Queue Approach
        // PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        // for(int num : nums){
        //     maxHeap.add(Math.abs(num));
        // }

        // int n = nums.length;
        // int k = Math.ceilDiv(n,2);
        // long sum = 0;
        // while(n>0){
        //     if(k>0){
        //         sum +=(long) Math.pow(maxHeap.poll(),2);
        //         k--;
        //     }
        //     else{
        //         sum -=(long) Math.pow(maxHeap.poll(), 2);
        //     }
        //     n--;
        // }

        // return sum;


    }
}