class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int count = 0;

        int n = nums.length - 1;
        for(int i = n; i>=2 ; i--){
            int thirdSide = nums[i];
            int k = 0 ; 
            int j = i-1;
            while(k < j ){
                if(nums[k] + nums[j] > thirdSide){
                    count += j-k;
                    j--;
                }

                else {
                    k++;
                }
                
            }

            // for(int i = 0; i<=n-2 ; i++){
            //     for(int j = i+1 ; j<=n-1 ; j++){
            //         if(nums[i] + nums[j] > thirdSide){
            //             count++;
            //         }
            //     }
            // }
            
        }
        return count;
    }
}