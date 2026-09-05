class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        
        // Step 1. Create SuffixMin Array
        int[] suffixMin = new int[n];
        suffixMin[n-1] = nums[n-1];
        for(int i = n-2 ; i>=0 ; i--){
            suffixMin[i] = Math.min(nums[i], suffixMin[i+1]);
        }

        // Step 2. Get the answer by subtracting the current min value from suffixMin(Temp array ) to the Current max value from the Nums(main array).
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i<n; i++){
            max = Math.max(max,nums[i]);
            int temp = max - suffixMin[i];
            if(temp <= k) return i;
        }
        return -1;
    }
}