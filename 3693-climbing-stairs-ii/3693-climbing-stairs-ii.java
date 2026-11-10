class Solution {
    public int climbStairs(int n, int[] cost) {
        if(n == 0) return 0;
        if(n == 1) return cost[0] + 1;
        //int n = cost.length;
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = cost[0] + 1;
        dp[2] = cost[1] + Math.min(dp[1] + 1, dp[0] + 4);
        for(int i = 2; i < n ; i++){
            dp[i+1] = cost[i] +  Math.min(dp[i] + 1, Math.min(dp[i-1] + 4, dp[i-2] + 9));
        }
        return dp[n];
    }
}