class Solution {
    public int sortPermutation(int[] nums) {
        int n = nums.length;
        int k = -1;
        //boolean changed = false;
        for(int i = n-1 ; i >= 0 ; i--){
            if(nums[i] == i){continue;}
            else{

                if(k == -1) k = nums[i];
                else{
                    k &= nums[i];
                }
                // int x = nums[i];
                // int y = nums[x];
                // nums[i] = y;
                // nums[x] = x;
                // int temp = x & y;
                // if(k == -1){ k = temp;}
                // else if(k != temp){ return 0;}

            }
        }
        if(k == -1) return 0;
        return k;
    }
}