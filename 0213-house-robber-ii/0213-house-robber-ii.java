class Solution {
    public static int HouseRob(int[] nums, int x , int n){
      int prev1 = nums[x];
      int prev2 = Math.max(nums[x], nums[x+1]);
      int res = prev2;
      for(int i = x+2 ; i<n; i++){
        res = Math.max(prev1+nums[i], prev2);
        prev1 = prev2;
        prev2 = res; 
      }

      return res;
    }
    public int rob(int[] nums) {
        int n = nums.length;
        if(n== 1) return nums[0];
        if(n == 2) return Math.max(nums[1], nums[0]);

        int a = HouseRob(nums,0,n-1);
        int b = HouseRob(nums,1,n);
        return Math.max(a,b);


    }
}