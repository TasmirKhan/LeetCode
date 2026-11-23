class Solution {
    public int removeDuplicates(int[] nums) {

        int n = nums.length;
        int[] res = new int[n];
        res[0] = nums[0];
        int x = 1;
        for(int i = 1 ; i < n ; i++){
            if(nums[i] != res[x-1]){ res[x++] = nums[i];}
            else{
                if(x == 1){ res[x++] = nums[i];}
                else if(res[x-1] != res[x-2]){
                    res[x++] = nums[i];
                }
            }
        }
        for(int i = 0 ; i < x ; i++){
            nums[i] = res[i];
        }
        return x;

        // int j = 1;
        // for(int i = 1 ; i < nums.length ; i++){
        //     if(nums[i] != nums[i-1]){
        //         nums[j++] = nums[i];
        //     }
        //     else{
        //         if(i-1 == 0 ){
        //             nums[j++] = nums[i];
        //         }          
        //         else if( nums[i-1] != nums[i-2]){
        //             nums[j++] = nums[i];
        //         }      
        //     }
        // }
        // return j;
    }
}