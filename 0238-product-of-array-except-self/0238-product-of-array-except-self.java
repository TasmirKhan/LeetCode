class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zero = 0;
        long mult = 1;
        int n = nums.length;
        int zeroIdx = 0;

        for(int i = 0 ; i < n ; i++){
            int num = nums[i];
            if(num == 0){ zero++; zeroIdx = i; }
            else{ mult *= num; }
        }

        int [] arr = new int[n];
        if(zero >= 2) return arr;

        else if(zero == 0){
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == 0){ arr[i] = (int)mult;}
            else{ arr[i] = (int)mult/nums[i]; }
        } }

        else{
            arr[zeroIdx] = (int)mult;
        }



        return arr;
    }
}