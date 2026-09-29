class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0];
        
        // int[] dp = new int[n];
        // dp[0] = nums[0];
        // dp[1] = Math.max(nums[0],nums[1]);
        
        int prev1 = nums[0];
        int prev2 = Math.max(nums[0], nums[1]);
        int result = prev2;

        for(int i = 2 ; i<n ; i++){
            result = Math.max(prev1 + nums[i], prev2);
            prev1 = prev2;
            prev2 = result;
        }

        return result;
    }
}