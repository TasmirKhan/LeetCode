class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        boolean [] arr = new boolean[n+1];
        int duplicate = 0;
        for(int i = 0; i<n ; i++){
            if(arr[nums[i]]){duplicate = nums[i];}
            else{arr[nums[i]] = true;}
        }

        int[] ans = new int[2];
        int a = 0;
        for(int i = 1 ; i<n+1; i++){
            if(!arr[i]){
                 return new int[]{duplicate,i};
            }           
        }

        return ans;

    }
}