class Solution {
    public int tribonacci(int n) {
        if(n==0) return 0;
        if(n<=2) return 1;

        long a = 0;
        long b = 1;
        long c = 1;
        for(int i = 3 ; i<=n ; i++){
            long temp1 = c;
            long temp2 = b;
            c = a+b+c;
            b = temp1;
            a = temp2;
        }
        return (int)c;

        }
}