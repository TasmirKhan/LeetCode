class Solution {
    public int firstStableIndex(int[] nums, int k) {
       
        int n = nums.length;
        
        int[] suffixMin = new int[n];
        suffixMin[n-1] = nums[n-1];

        for(int i = n-2 ; i>=0 ; i--){
            suffixMin[i] = Math.min(suffixMin[i+1], nums[i]);
        }

        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i<nums.length ; i++){
            max = Math.max(nums[i],max);
            if(max - suffixMin[i] <= k) return i;
        }

        return -1;
       
    }
}