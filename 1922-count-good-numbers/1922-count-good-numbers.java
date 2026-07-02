class Solution {
    static int mod = 1000000007;
    public int countGoodNumbers(long n) {
        long even = (n+1)/2;
        long odd = n/2;

        long evenVal = pow(even, 5);
        long oddVal = pow(odd, 4);

        return (int)((evenVal*oddVal)%mod);
    }

    public static long pow(long exp, long n){
        long res = 1;
        while(exp >= 1){
            if(exp%2 == 1){
                res = (res*n)%mod;
                exp--;
            }
            else{
                n = (n*n)%mod;
                exp /=2;                
            }
        }
        return res;
    }
}