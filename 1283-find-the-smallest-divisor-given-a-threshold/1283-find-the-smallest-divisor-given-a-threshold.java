class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int res = -1;
        int min = 1;
        int max = Integer.MIN_VALUE;

        for(int num : nums){
            max = Math.max(max,num);
        }
        while(min <= max){
            int mid = min + (max-min)/2;
            int sum = 0;
            for(int i = 0 ; i<nums.length ; i++){
                sum+= (int)Math.ceil((double)nums[i]/mid);
            }
            if(sum<= threshold){
                res = mid;
                max = mid -1;
            }
            else{
                min = mid+1;
            }
        }
        return res;
    }
}