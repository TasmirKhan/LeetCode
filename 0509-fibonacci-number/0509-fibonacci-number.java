class Solution {
    public int fib(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;

       return fib(n-1) + fib(n-2);
    }
    // public static int recurse(int n, int a,int b){
    //     if(n-1 <= 0 ) return a+b;
    
    //     int temp = b;
    //     b = a+b;
    //     a = temp;
    //     return recurse(n-1, a, b);
    // }
}