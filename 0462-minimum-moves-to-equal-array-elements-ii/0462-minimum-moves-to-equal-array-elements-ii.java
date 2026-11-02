class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        if(n <= 1) return 0;
        int median1 = nums[n/2];
        
        long sum1 = 0;
        

        for(int num : nums){
            sum1 += Math.abs( median1 - num);
        }

        return (int)sum1;


    }
}