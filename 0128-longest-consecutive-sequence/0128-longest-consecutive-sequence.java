class Solution {
    public int longestConsecutive(int[] nums) {
        // int i = 0 ; 
        //if(nums.length == 0) return 0
        if(nums.length == 0) return 0;
        if(nums.length == 1) return 1;
        int len = 0; 
        int counter = 1;

        Arrays.sort(nums);
        for(int i = 1 ; i < nums.length ; i++){
            if(nums[i]-nums[i-1] == 0) {len = Math.max(len,counter); continue;}
            else if(nums[i] - nums[i-1] == 1){
                counter++;
                len = Math.max(len, counter);
            }
            else{
                len = Math.max(len, counter);
                counter = 1;
            }
        }
        return len;
    }
}