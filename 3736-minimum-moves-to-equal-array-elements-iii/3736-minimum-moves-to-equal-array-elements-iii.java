class Solution {
    public int minMoves(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int num : nums){
            max = Math.max(max,num);
        }

        int sum = 0;
        for(int num : nums){
            sum += (max-num);
        }

        return sum;
    }
}