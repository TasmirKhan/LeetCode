class Solution {
    public int minimumSum(int[] nums) {
        int n = nums.length;
        int[] leftMin = new int[n];
        int[] rightMin = new int[n];

        leftMin[0] = nums[0];
        rightMin[n-1] = nums[n-1]; 
        
        for(int i = 1 ; i < n ; i++){
            leftMin[i] = Math.min(leftMin[i-1], nums[i]);
            rightMin[n-1-i] = Math.min(rightMin[n-1-i + 1] , nums[n-1-i]);
        }

        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i < n ; i++){
            if(nums[i] > leftMin[i] && nums[i] > rightMin[i]){
                min = Math.min(min, leftMin[i] + nums[i] + rightMin[i]);
            }
        }

        if(min == Integer.MAX_VALUE) return -1;
        return min;

    }
}