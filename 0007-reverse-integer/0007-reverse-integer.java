class Solution {
    public int reverse(int x) {
        long temp = 0;
        boolean neg = false;
        if(x<0){ neg = true; x = Math.abs(x);}
        while(x > 0){
            temp = temp*10 + x%10;
            x = x/10;
            if(temp>=Integer.MAX_VALUE || temp <= Integer.MIN_VALUE) return 0;

        }
        return neg ? (int)-temp :(int) temp;
    }
}