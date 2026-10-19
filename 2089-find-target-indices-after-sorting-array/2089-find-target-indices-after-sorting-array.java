class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> lst = new ArrayList<>();
        int n = nums.length;
        int idx = 0;
        boolean found = false;
        for(int i = 0 ; i < n ; i++){
            
           if(nums[i] == target){
                lst.add(i);
            }
        }
        return lst;
    }
}