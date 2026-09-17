class Solution {
    public int reverse(int x) {
        if(x == 0) return 0;
        boolean neg = false;
        if(x < 0){
            neg = true;
            x = Math.abs(x);
        }
        while(x%10 == 0){
            x = x/10;
        }
        long sum = 0;
        while(x > 0){
            sum  = (sum*10) + x%10;
            x = x/10;
            if((sum > Integer.MAX_VALUE || sum < Integer.MIN_VALUE)) return 0;
        }
        if(neg) return (int)(-1*sum);
        return (int)sum;
    }
}