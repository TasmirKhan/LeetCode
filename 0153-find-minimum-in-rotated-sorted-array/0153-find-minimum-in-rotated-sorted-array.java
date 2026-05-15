class Solution {
    public int findMin(int[] nums) {
        int small = Integer.MAX_VALUE;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]<small){
        //         small = nums[i];
        //     }
        // }
        // return small;
        // int low = 0, high = nums.length-1; int ans = Integer.MAX_VALUE;
        // while(low <= high){
        //     int mid = low +(high-low)/2;
        //     if(nums[low]<=nums[high]){ return Math.min(ans,nums[low]);}
        //     if(nums[low]<=nums[mid]){
        //         ans = Math.min(ans,nums[low]);
        //         low = mid + 1;
        //     }
        //     else{
        //         ans = Math.min(ans,nums[mid]);
        //         high = mid - 1;
        //     }
        // }
        // return ans;
       
    int low = 0, high = nums.length - 1;

    while (low < high) {
        int mid = low + (high - low) / 2;

        if (nums[mid] > nums[high]) {
            low = mid + 1; // min in right part
        } else {
            high = mid; // min in left part (including mid)
        }
    }

    return nums[low];


    }
}