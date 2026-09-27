class Solution {
    public int maxProduct(int[] nums) {
        // Optimal approach
        int i = 0 , n = nums.length;
        int prod = 1 , prod2 = 1;
        int maxProd= Integer.MIN_VALUE;
        int maxprod2 = Integer.MIN_VALUE;

        while(i<n){
            if(nums[i] == 0){
                maxProd = Math.max(maxProd,0);
                prod = 1;
            }
            else{
                prod = prod* nums[i];
                maxProd = Math.max(maxProd,prod);
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
        return Math.max(maxProd,maxprod2);
    }

        // brute force approach
        // if(nums.length == 1) return nums[0];
        // long prod = Integer.MIN_VALUE;
        // int n = nums.length;

        // for(int i = 0 ; i<n ; i++){
        //     long tempProd = nums[i];
        //     prod = Math.max(prod,tempProd);
        //     for(int j = i+1 ; j<n ; j++){
        //         tempProd *= nums[j];
        //         prod = Math.max(prod,tempProd);
        //     }
            
        // }      
        // return (int) prod;
   // }
}