class Solution {
    public int trailingZeroes(int n) {
        if(n<4) return 0;
        int x = 5;
        int ans = 0;
        while(x <= n){
            ans += n/x;
            x *=5;
        }
        return ans;
    }
}