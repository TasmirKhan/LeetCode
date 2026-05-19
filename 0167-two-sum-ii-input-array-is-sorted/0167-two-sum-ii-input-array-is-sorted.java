class Solution {
    public int[] twoSum(int[] nums, int target) {
       int n = nums.length;
       int left = 0 ;
       int right = n-1;

       while(left <= right){
        int x = nums[left] + nums[right];
        if(x > target){right--;}
        else if(x < target){left++;}
        else{ return new int[]{left+1,right+1};}
       }

       return new int[]{-1,-1};
    }
}