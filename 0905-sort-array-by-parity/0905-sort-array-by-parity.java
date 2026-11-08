class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        if(n <= 1) return nums;
        int left = 0;
        int right = n-1;
        while(left <= right){
            if(nums[left]%2 == 1 && nums[right]%2 == 0){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++; right--;
            }
            else if(nums[left]%2  == 0){
                while( left <= right && nums[left]%2 == 0){
                    left++;
                }
            }

            else if(nums[right]%2 == 1){
                while(right >= left && nums[right]%2 == 1){
                    right--;
                }
            }
        }
        return nums;
    }
}