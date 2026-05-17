class Solution {
    public int singleNumber(int[] nums) {
        int xor = 0 ;
        for(int num : nums){
            xor ^= num;
        }
        return xor;

        // HashSet<Integer> set  = new HashSet<>();

        // for(int i = 0 ; i<nums.length ; i++){
        //     if(set.contains(nums[i])){set.remove(nums[i]);}
        //     else{ set.add(nums[i]);}
        // }
        // return set.stream().findFirst().get();
    }
}