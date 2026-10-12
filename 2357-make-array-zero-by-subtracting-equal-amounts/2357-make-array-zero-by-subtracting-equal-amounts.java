class Solution {
    public int minimumOperations(int[] nums) {

        int[] arr = new int[101];
        int cnt = 0;

        for(int num : nums){
            arr[num]++;
        }

        for(int i = 1 ; i < 101 ; i++){
            if(arr[i] != 0) cnt++;
        }
        return cnt;

        // Arrays.sort(nums);
        // int n = nums.length;
        // int cnt = 0;
        // for(int i = n-1 ; i>0 ; i--){
        //     nums[i] = nums[i] - nums[i-1];
        // }  
        // for(int num : nums){
        //     if(num != 0) cnt++;
        // }
        // return cnt;
    }
}