class Solution {
    public int longestConsecutive(int[] nums) {
        // int i = 0 ; 
        //if(nums.length == 0) return 0;
        
        int len = 0; 
        int counter = 1;
        int lastSmaller = Integer.MIN_VALUE;

        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length ; i++){
          if(nums[i] - lastSmaller == 1){
            counter++;
            lastSmaller = nums[i];
          }
          else if( nums[i] != lastSmaller){
            counter = 1;
             lastSmaller = nums[i];
          }
          len = Math.max(len,counter);
        }
        return len;
    }
}