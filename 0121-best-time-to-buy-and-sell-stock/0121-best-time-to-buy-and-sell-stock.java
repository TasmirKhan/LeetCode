class Solution {
    public int maxProfit(int[] prices) {
        Stack<Integer> st = new Stack<>();
        int n = prices.length - 1;
        int res  = 0;
        st.push(prices[n--]);
        while(n >= 0){
            if(prices[n] > st.peek()){
            while(!st.isEmpty() && prices[n] > st.peek()){
                st.pop();
            }
            st.push(prices[n]); }

            res = Math.max(res, st.peek() - prices[n]);
            n--;
        }
    return res;
    }
}