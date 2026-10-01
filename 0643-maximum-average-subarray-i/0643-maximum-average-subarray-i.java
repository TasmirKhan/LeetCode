class Solution {
    public double findMaxAverage(int[] nums, int k) {
        if(nums.length == 1) return nums[0]/k;
        double ans = Integer.MIN_VALUE;
        int i = 0 , j = 0;
        double sum = 0;
        while(j<nums.length){
           
            while(j-i < k){
                sum += nums[j];
                j++;
            }

            ans = Math.max(ans, sum/k);

            if(j-i >= k){
                sum-=nums[i];
                i++;
                
            }
        }
        return ans;
    }
}