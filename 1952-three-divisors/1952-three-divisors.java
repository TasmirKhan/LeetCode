class Solution {
    private boolean isPrime(double x){
        if(x > 0 && x < 4) return true;
        for(int i = 2 ; i*i<=x; i++){
            if(x%i == 0) return false;
        }
        return true;
    }
    public boolean isThree(int n) {
         if(n == 4) return true;
        if(n%2 == 0 || n == 1) return false;
        double x = Math.sqrt(n);

        return x%2 != 0 && x%1 == 0 && isPrime(x);
       
    }
}