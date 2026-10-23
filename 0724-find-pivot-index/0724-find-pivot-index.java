class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        
        int[] suf = new int[n];

       
        suf[n-1] = nums[n-1];

        for(int i = 1 ; i < n ; i++){
            
            suf[n-1-i] = suf[n-i] + nums[n-i-1]; 
        }

        int sum = 0;
        for(int i = 0 ; i < n ; i++){
            sum += nums[i];
            if(sum == suf[i]) return i;
        }

        return -1;
    }
}