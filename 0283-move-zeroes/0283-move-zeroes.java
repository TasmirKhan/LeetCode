class Solution {
    public void moveZeroes(int[] nums) {
        
        int i = 0 , j = 0 ;

        while(i<nums.length){
            if(nums[j]!=0) j++;
            else if(nums[j] ==0 && nums[i] !=0){ 
                nums[j] = nums[i];
                nums[i] = 0;
                j++;
            }
            i++;
        }
        // while(i<nums.length){
        //     if(nums[i] != 0 ) {nums[j] = nums[i] ;j++;}
        //     i++;
        // }
        // while(j < nums.length){
        //     nums[j] = 0;
        //     j++;
        // }
    }
}