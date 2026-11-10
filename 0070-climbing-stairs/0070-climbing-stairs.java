class Solution {
    public static int helper(int n, int[] dp){
        if(n == 0 || n == 1) return 1;
        if(dp[n] != 0) return dp[n];
        return dp[n] = helper(n-1,dp) + helper(n-2, dp);
    }
    public int climbStairs(int n) {
       int[] dp = new int[n+1];
       return helper(n,dp);
    //    return climbStairs(n-1) + climbStairs(n-2);

    // int a = 1;
    // int b = 2;
    // for(int i = 3 ; i <= n ; i++){
    //     int temp = a;
    //     a = b;
    //     b = b+temp;
    // }

    // return b;
    }
}