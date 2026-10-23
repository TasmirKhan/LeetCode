class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] pre = new int[n];
        int[] suf = new int[n];

        pre[0] = nums[0];
        suf[n-1] = nums[n-1];

        for(int i = 1 ; i < n ; i++){
            pre[i] = pre[i-1] + nums[i];
            suf[n-1-i] = suf[n-i] + nums[n-i-1]; 
        }

        for(int i = 0 ; i < n ; i++){
            if(pre[i] == suf[i]) return i;
        }

        return -1;
    }
}