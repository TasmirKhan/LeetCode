class Solution {
    public double myPow(double x, int n) {
        double res = 1.0;
       long tempN = Math.abs((long)n);
       while(tempN > 0){
        if((tempN & 1) == 1){
            res = res*x;
        }
        x = x*x;
        tempN = tempN >> 1;
       }
       if(n >= 0) return res;
       return 1/res;
    }

}