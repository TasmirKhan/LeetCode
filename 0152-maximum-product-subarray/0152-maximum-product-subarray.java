class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length == 1) return nums[0];
        long prod = Integer.MIN_VALUE;
        int n = nums.length;
        for(int i = 0 ; i<n ; i++){
            long tempProd = nums[i];
            prod = Math.max(prod,tempProd);
            for(int j = i+1 ; j<n ; j++){
                tempProd *= nums[j];
                prod = Math.max(prod,tempProd);
            }
            
        }
        return (int) prod;
    }
}