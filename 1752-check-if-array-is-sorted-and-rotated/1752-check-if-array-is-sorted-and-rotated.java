class Solution {
    public boolean check(int[] nums) {
        if(nums.length <= 2) return true;
        int count = 0 ;
        int n = nums.length;
        for(int i = 0 ; i<nums.length ; i++){
            int j = i;

           if(nums[j%n] > nums[(j+1)%n])count++;
        }
        if(count >1) return false;
        return true;
    }
}