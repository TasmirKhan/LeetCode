class Solution {
    public int missingMultiple(int[] nums, int k) {
        Arrays.sort(nums);
        int x  = k;
        for(int num : nums){
            if(num%k == 0 && num > x) return x;
            if(num%k ==0 && num == x) x += k;
        }
        return x;
    }
}