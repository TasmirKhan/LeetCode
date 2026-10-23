class Solution {
    public int dominantIndex(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int slargest = Integer.MIN_VALUE;
        int idx = -1;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] > largest){
                slargest = largest;
                largest = nums[i];
                idx = i;
            }
            else if(nums[i] > slargest){
                slargest = nums[i];
            }
        }

        if(largest >= (2*slargest)) return idx;
        return -1;
    }
}