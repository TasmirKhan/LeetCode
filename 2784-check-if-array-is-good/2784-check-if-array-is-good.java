class Solution {
    public boolean isGood(int[] nums) {
        Arrays.sort(nums);
        int x = nums[nums.length - 1];
        if(nums.length != x + 1) return false;
        int i = 0 ;
        while(i<nums.length-1){
            if(nums[i] != i+1) return false;
            i++;
        }
        if(nums[i] != x) return false;
        return true;
    }
}