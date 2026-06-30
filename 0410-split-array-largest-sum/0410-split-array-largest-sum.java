class Solution {
    public static boolean isPossible(int[] arr, int l , int k){
        int temp = 1;
        int sum = 0;
        for(int num : arr){
            if(sum+num <= l){
                sum +=num;
            }
            else{
                sum = num;
                temp++;
            }
        }
        return temp <= k;
    }

    public int splitArray(int[] nums, int k) {
        int maxEle = Integer.MIN_VALUE;
        int sum = 0;
        
        for(int num : nums){
            maxEle = Math.max(maxEle, num);
            sum+= num;
        }
        int ans = maxEle;
        while(maxEle <= sum){
            int mid = maxEle + (sum - maxEle)/2;

            if(isPossible(nums, mid, k)){
                ans = mid;
                sum= mid-1;
            }
            else { 
                maxEle = mid + 1;
            }
        }
        return ans;
    }
}