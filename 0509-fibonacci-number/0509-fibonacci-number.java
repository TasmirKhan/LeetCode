class Solution {
    public int fib(int n) {
        if(n == 0) return 0;
       return recurse(n-1,0,1);
    }
    public static int recurse(int n, int a,int b){
        if(n-1 <= 0 ) return a+b;
    
        int temp = b;
        b = a+b;
        a = temp;
        return recurse(n-1, a, b);
    }
}