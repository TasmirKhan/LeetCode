class Solution {
    public int[] separateDigits(int[] nums) {
        int totalSize = 0;
       for(int n : nums){
        totalSize += (n ==0 ) ? 1 : (int) Math.log10(n) + 1;
       }

       int[] arr = new int[totalSize];
        int idx = totalSize -1;
       for(int i = nums.length -1 ; i>=0 ; i--){
        if(nums[i] == 0){ arr[idx--] = 0; continue;}
        while(nums[i] > 0){
                int x  = nums[i] %10;
                arr[idx--] = x;
                nums[i]/=10;
            
        }
       }
       return arr;
    }
}