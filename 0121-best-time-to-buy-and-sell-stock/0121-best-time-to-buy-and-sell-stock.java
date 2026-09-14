class Solution {
    public int maxProfit(int[] prices) {
       int j = 0;
       int n = prices.length;
       int res = Integer.MIN_VALUE;
       int min = prices[j++];
       int max = 0;
       while(j<n){
            if(prices[j] < min){
                min = prices[j];
            }
            max = Math.max(max, prices[j] - min );
            j++;
       }
       return max;
    }
}