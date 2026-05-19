class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
       int count = 1;
       int i = 0 , j = 0;

       while(j<nums.length){
        if(nums[i] != nums[j]){
            nums[i+1] = nums[j];
            count++;
            i++;
            j++;
        }
        else{
            j++;
        }
       }

       return count;

    }
}