class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length == 1) return nums[0];
        long prod = Integer.MIN_VALUE;
        int n = nums.length;

        for(int i = 0 ; i<n ; i++){
            long tempProd = nums[i];
            for(int j = i+1 ; j<n ; j++){
                 prod = Math.max(prod,tempProd);
                tempProd *= nums[j];
                prod = Math.max(prod,tempProd);
            }
            
        }

        prod = Math.max(prod,nums[n-1]);
        return (int) prod;
    }
}