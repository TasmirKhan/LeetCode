class Solution {

    public static int helper(int n, int[] arr){
        
        if(arr[n] != -1) return arr[n];

        return arr[n] = helper(n-1, arr) + helper(n-2, arr);
    }
    
    public int climbStairs(int n) {
        int[] arr = new int[n+1];
        Arrays.fill(arr,-1);
        arr[0] = 1;
        arr[1] = 1;
        return helper(n,arr);
        
        
    }
}