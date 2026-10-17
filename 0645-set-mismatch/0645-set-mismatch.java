class Solution {
    public int[] findErrorNums(int[] nums) {
        // Approach 1. Modifying the existing array 
        int duplicate = -1;
        int missing = -1;

        for(int i = 0 ; i < nums.length ; i++){
            int idx = Math.abs(nums[i])-1;

            if(nums[idx] < 0){
                duplicate = idx + 1;
            }else{
                nums[idx] = -nums[idx] ; 
            }

        }

        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] > 0){
                missing = i+1;
                break;
            }
        }

        return new int[] {duplicate, missing};


        // Approach 2. Using Boolean Array
        // int n = nums.length;
        // boolean [] arr = new boolean[n+1];
        // int duplicate = 0;

        // for(int i = 0; i<n ; i++){
        //     if(arr[nums[i]]){duplicate = nums[i];}
        //     else{arr[nums[i]] = true;}
        // }

        // int[] ans = new int[2];
        // int a = 0;
        // for(int i = 1 ; i<n+1; i++){
        //     if(!arr[i]){
        //          return new int[]{duplicate,i};
        //     }           
        // }

        // return ans;

    }
}