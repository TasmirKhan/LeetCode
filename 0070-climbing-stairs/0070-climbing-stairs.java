class Solution {
    public int climbStairs(int n) {
       if(n == 0 || n == 1) return 1;
       if(n == 2) return 2;
    //    return climbStairs(n-1) + climbStairs(n-2);

    int a = 1;
    int b = 2;
    for(int i = 3 ; i <= n ; i++){
        int temp = a;
        a = b;
        b = b+temp;
    }

    return b;
    }
}