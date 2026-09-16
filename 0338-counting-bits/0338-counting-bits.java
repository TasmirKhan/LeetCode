class Solution {
    private int BitCounter(int n){
        int x = 0;
        while(n>0){
            if((n&1) == 1) x++;
            n = n>>1;
        }
        return x;
    }
    public int[] countBits(int n) {
        int[] res = new int[n+1];
        res[0] = 0;
        for(int i = 1 ; i<=n ; i++){
            res[i] = BitCounter(i);
        }
        return res;
    }
}