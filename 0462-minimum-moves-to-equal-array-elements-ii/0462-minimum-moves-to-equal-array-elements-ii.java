class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        if(n <= 1) return 0;
        int median1 = n/2;
        int median2 = median1 + 1;
        boolean even = false;

        if(n % 2 == 0) even = true;
        long sum1 = 0;
        long sum2 = 0;

        for(int num : nums){
            sum1 += Math.abs( nums[median1] - num);
            if(median2 < n) sum2 += Math.abs( nums[median2] - num);
        }

        if(even && n >= 3) return (int)Math.min(sum1,sum2);
        return (int)sum1;


    }
}