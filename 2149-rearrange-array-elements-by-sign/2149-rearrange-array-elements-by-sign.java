class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int evenIdx = 0;
        int oddIdx = 1;
        for(int i = 0 ; i<nums.length ; i++){
            if(nums[i] >= 0 && evenIdx < n){
                res[evenIdx] = nums[i];
                evenIdx +=2;
            }
            else{
                res[oddIdx] = nums[i];
                oddIdx += 2;
            }
        }
        return res;
    }
}