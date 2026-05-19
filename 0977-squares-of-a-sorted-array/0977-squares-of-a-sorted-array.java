class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
       int left = 0 ;
       int right = n - 1;
       int k = n-1;
       int[] res = new int[n];



       while(left <= right){
        int leftElement = nums[left]*nums[left];
        int rightElement = nums[right]*nums[right];

        if(leftElement >= rightElement){
            res[k--] = leftElement;
            left++;
        }
        else{
            res[k--] = rightElement;
            right--;
        }
       }
       return res;
    }
}