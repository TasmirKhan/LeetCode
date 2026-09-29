class Solution {
    // Memorization Dp
    public static int helper(int n, int[] arr){
        if(arr[n] != -1) return arr[n];
        return arr[n] = helper(n-1, arr) + helper(n-2, arr);
    }
    
    public int climbStairs(int n) {
        // Tabulation Dp
        if(n==1 || n==2) return n;
        int[] arr = new int[n+1];
        arr[1] = 1;
        arr[2] =2;
        for(int i = 3 ; i<=n ; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        
        return arr[n];
    }
}