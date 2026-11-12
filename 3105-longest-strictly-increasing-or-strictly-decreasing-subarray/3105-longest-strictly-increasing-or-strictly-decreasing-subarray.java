class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n = nums.length;
        //if(n ==) return 1;
        if(n <=1) return 1;
        int inc = 1, dec = 1;
        int i = 0, j = 1;
        while(j < n){
            if(nums[j] > nums[j-1]){
                j++;
                if(j == n){ inc = Math.max(inc, j-i);  }
            }
            else{
               inc =  Math.max(inc, j-i);
                i = j;
                j++;                
            }
        }

        i = 0 ; j = 1;
        while(j < n){
            if(nums[j] < nums[j-1]){
                j++;
                if(j == n){ dec = Math.max(dec, j-i);  }
            }

            else{
                dec = Math.max(dec, j-i);
                i = j;
                j++;
            }
        }

        return Math.max(inc, dec);
    }
}