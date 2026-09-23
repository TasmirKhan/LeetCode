class Solution {
    public int reverse(int x) {
        boolean negative = false;
        if(x<0){ negative = true;  x = Math.abs(x);}
        long reversed = 0;
        while(x > 0){
            reversed = (reversed*10) + (x%10);
           if(reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) return 0;
            x = x/10;

        }
        if(negative){ return -1*(int)reversed;}
        return (int)reversed;
    }
}