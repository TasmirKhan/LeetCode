class Solution {
    public int maxArea(int[] nums) {
        int max = 0;
        for(int i = 0 ; i<nums.length ; i++){
            int currH = nums[i];
            for(int j = i+1 ; j<nums.length ; j++){
                int minH = Math.min(currH, nums[j]);
                int water = minH * (j-i);
                max = Math.max(max,water);
            }
        }
        return max;
    }
}