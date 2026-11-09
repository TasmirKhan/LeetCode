class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length ;
        if(n <= 1) return nums;

        int[] oddarr = new int[n/2];
        int[] evenarr = new int[n/2];
        int i = 0 , j = 0;
        for(int k = 0 ; k < n ; k++){
            if(nums[k]%2 == 0){
                evenarr[i++] = nums[k];
            }
            else{
                oddarr[j++] = nums[k];
            }
        }

        i = 0; j = n/2-1;
        int x = 0;
        while(x < n){
            nums[x] = evenarr[j--];
            nums[x+1] = oddarr[i++];
            x+=2;
        }
        return nums;
    }
}