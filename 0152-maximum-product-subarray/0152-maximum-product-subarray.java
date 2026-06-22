class Solution {
    public int maxProduct(int[] nums) {
        int i = 0 , n= nums.length;
        int prod = 1;  int prod2 = 1;
        int maxprod = Integer.MIN_VALUE;
        int maxprod2 = Integer.MIN_VALUE;

        while(i<n){
            if(nums[i] == 0){
                maxprod = Math.max(maxprod,0);
                prod = 1;
            }
            else{
                prod = nums[i]*prod;
                maxprod = Math.max(prod,maxprod);
            }
            i++;
        }
        int j = n-1;
        while(j>=0){
            if(nums[j] == 0){
                maxprod2 = Math.max(maxprod2,0);
                prod2 = 1;
            }
            else{
                prod2 = nums[j]*prod2;
                maxprod2 = Math.max(prod2,maxprod2);
            }
            j--;
        }
        return Math.max(maxprod,maxprod2);
    }
}