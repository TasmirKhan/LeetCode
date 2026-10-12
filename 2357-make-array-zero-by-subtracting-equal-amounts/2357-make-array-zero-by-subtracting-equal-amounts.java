class Solution {
    public int minimumOperations(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int cnt = 0;
        for(int i = n-1 ; i>0 ; i--){
            nums[i] = nums[i] - nums[i-1];
        }  
        for(int num : nums){
            if(num != 0) cnt++;
        }
        return cnt;
    }
}