class Solution {
    public int bagOfTokensScore(int[] nums, int power) {
        Arrays.sort(nums);
        //boolean[] arr = new boolean(n);
        int n = nums.length;
        int i = 0 , j = n-1;
        int score = 0;
        int max = 0;
        while((i<n) && (j>=0) && (score > 0 || power >= nums[i])){
            while(i<n && power >= nums[i]){
                power -= nums[i];
                score++;
                i++;
            }

            max = Math.max(max,score);

            while(j >= 0 && score > 0){
                score--;
                power += nums[j];
                j--;
                if(i < n && power >= nums[i]) break;
            }
        }

        return max;
    }
}