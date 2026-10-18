class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int n = nums.length;
        int max = 1;
        for(int i = 1; i<n ; i++){
            if(nums[i] - nums[i-1] >= 1){
                int cnt = 1;
            while(i<n && nums[i]-nums[i-1] >=1){
                cnt++;
                i++;
            }
             max = Math.max(max,cnt);
            }
        }
        return max;
    }
}