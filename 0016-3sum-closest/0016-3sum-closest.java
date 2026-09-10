class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int prevX = Integer.MAX_VALUE;
        int n = nums.length;
        int ans = 0;
        for(int i = 0 ; i<n ; i++){
            for(int j = i+1 ; j<n ; j++){
                for(int k = j+1 ; k<n; k++){
                    int min = nums[i] + nums[j] +nums[k];
                    int x  = Math.abs(target - min);
                    if(x < prevX) {ans = min; prevX = x; }
                }
            }
        }
        return ans;
    }
}