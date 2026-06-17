class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0 ;
        int j = 0 ;
        Set<Integer> set = new HashSet<>();
        while(i<nums.length){
            if(!set.contains(nums[i])){
                nums[j] = nums[i];
                set.add(nums[i]);
                j++;
            }
            i++;
        }
        return j;
    }
}