class Solution {
    public boolean canPlaceFlowers(int[] nums, int k) {
        int n = nums.length;
        if(n == 1 && nums[0] == 0 && k == 1) return true;
        int cnt = 0;
        int i = 0;
       while(i < n){

        if(nums[i] == 1){
            --i;
            i+=2;
        }

        else{
            if(i == 0 && i+1 < n && nums[i+1] == 0){
                cnt++;
                nums[i] = 1;
                i+=2;
            }
            else if(i == n-1 && i-1 >=0 && nums[i-1] == 0){
                cnt++;
                nums[i] = 1;
                i+=2; 
            }
            else if(i-1 >= 0 && i+1 < n && nums[i-1] == 0 && nums[i+1] == 0){
                cnt++;
                nums[i] = 1;
                i+=2;
            }
            else{
                i+=1;
            }
        }
       }
       if(n-1 >=0 && n-2 >= 0 && nums[n-1] == 0 && nums[n-2] == 0) cnt++;
       return cnt >= k;
    }
}