class Solution {
    public int minMoves2(int[] nums) {

        // Approach 0. Two Pointer
        Arrays.sort(nums);
        int i = 0 , j = nums.length - 1;
        long sum = 0;
        while(i < j){
            sum += nums[j] - nums[i];
            i++ ; j--;
        }
        return (int)sum;

        // Approach 1. Using Median Property
        // Arrays.sort(nums);
        // int n = nums.length;
        // if(n <= 1) return 0;
        // int median1 = nums[n/2];
        
        // long sum1 = 0;      
        // for(int num : nums){
        //     sum1 += Math.abs( median1 - num);
        // }

        // return (int)sum1;


    }
}