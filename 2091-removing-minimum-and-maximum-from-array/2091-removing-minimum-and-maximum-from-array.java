class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        if(nums.length == 1) return 1;
        if(nums.length == 2) return 2;
        int minIdx = 0;
        int maxIdx = 0;
        int min = nums[0];
        int max = nums[0];

        for(int i=0 ; i<nums.length ; i++){
            int num = nums[i];
            if(num > max){ max = num; maxIdx = i;}
            if(num < min){ min = num; minIdx = i;}
        }

        int left = Math.min(minIdx, maxIdx);
        int right = Math.max(minIdx, maxIdx);

        int front = right + 1;
        int back = n-left;
        int both = left - right + n+1;
        return Math.min(front, Math.min(back,both));
    }
}