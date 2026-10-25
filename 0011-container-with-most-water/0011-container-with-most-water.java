class Solution {
    public int maxArea(int[] nums) {
        int max = 0;
        int i = 0, j = nums.length - 1;

        while(i < j){
            max = Math.max(max,(Math.min(nums[i],nums[j])*(j-i)));
            if(nums[i] < nums[j]){i++;}
            else{j--;}
        }

        return max;
        

        // Nested Loops (TLE)
        // int max = 0;
        // for(int i = 0 ; i<nums.length ; i++){
        //     int currH = nums[i];
        //     for(int j = i+1 ; j<nums.length ; j++){
        //         int minH = Math.min(currH, nums[j]);
        //         int water = minH * (j-i);
        //         max = Math.max(max,water);
        //     }
        // }
        // return max;
    }
}