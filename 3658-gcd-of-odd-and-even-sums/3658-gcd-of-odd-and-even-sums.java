class Solution {
    public static int GCD(int a , int b){
       if(b==0) return a;
       return GCD(b,a%b);
    }

    public int gcdOfOddEvenSums(int n) {
        int sumOdd = n*n ; 
        int sumEven = n*(n+1) ;
        int num = 1;
       

        return GCD(sumOdd, sumEven);
    }
}