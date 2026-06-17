class Solution {
    public void rotate(int[] nums, int k) {
        
        int[] arr = new int[k];
        int n = nums.length ;
        k = k%n;

        for(int i = 0 ; i<k ; i++){
            arr[i] = nums[n-k+i];
        } // correct

        int x = n-k-1;
        for(int i = n-1 ; x>=0 ; i-- ,x--){
            nums[i] = nums[x];
        }

        for(int i = 0 ; i<k ; i++){
             nums[i] = arr[i];
        }

    }
}