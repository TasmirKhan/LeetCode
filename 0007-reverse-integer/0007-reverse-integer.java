class Solution {
    public int reverse(int x) {
        if(x == 0 || (long)x >= Integer.MAX_VALUE || (long)x <= Integer.MIN_VALUE) return 0;
        boolean neg = false;
        if(x < 0){
            neg = true;
            x = Math.abs(x);
        }
        while(x%10 == 0){
            x = x/10;
        }
        int sum = 0;
        while(x > 0){
            sum  = (sum*10) + x%10;
            x = x/10;
        }
        if(neg) return -1*sum;
        return sum;
    }
}