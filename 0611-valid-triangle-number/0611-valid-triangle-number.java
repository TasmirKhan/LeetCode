class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int count = 0;

        int n = nums.length - 1;
        while(n>=2){
            int thirdSide = nums[n];
            for(int i = 0; i<=n-2 ; i++){
                for(int j = i+1 ; j<=n-1 ; j++){
                    if(nums[i] + nums[j] > thirdSide){
                        count++;
                    }
                }
            }
            n-=1;
        }
        return count;
    }
}