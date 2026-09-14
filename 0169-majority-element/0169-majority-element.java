class Solution {

    public int majorityElement(int[] nums) {
        int x = nums[0];
        int y = 0;
        for(int i = 1 ; i<nums.length ; i++){
            if(nums[i] == x){
                y++;
            }
            else{ y--; }
            if(y<0) { x = nums[i]; y = 0;}

        }
        return x;
    }
}