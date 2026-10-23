class Solution {
    public int minCostClimbingStairs(int[] cost) {

        int n = cost.length;
        int[] dp = new int[n];

        for(int i = 0 ; i < n; i++){
            if(i < 2) dp[i] = cost[i];
            else dp[i] = cost[i] + Math.min(dp[i-1], dp[i-2]);
        }

        return Math.min(dp[n-1], dp[n-2]);

        // int minCost = 0;
        // int i = cost.length;
        // while(i-1 > 0){        
        //     if(cost[i-2] > cost[i-1]){
        //         minCost += cost[i-1];
        //         i = i-1;
        //      }
        //      else{
        //         minCost += cost[i-2];
        //         i = i-2;
        //      }
        // }
        // return minCost;
    }
}