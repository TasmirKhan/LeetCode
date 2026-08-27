class Solution {
    public int maxProfit(int[] prices) {
        
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = Integer.MIN_VALUE;

        for(int x : prices){
            if(x < minPrice){ minPrice = x;}
            int Profit = x - minPrice;
            if(Profit > maxProfit){maxProfit = Profit;}
        }
        // for(int i = 0 ; i<prices.length ; i++){
        //     for(int j = i+1; j<prices.length ; j++){
        //         int x = prices[j] - prices[i];
        //         if(x > max){ max = x; }
        //     }
        // }
        return maxProfit;
    }
}