class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> lst = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            HashSet<Integer> set = new HashSet<>();
            for(int j=i+1;j<nums.length;j++){
               
                if(set.contains(-(nums[i]+nums[j]))){
                    List<Integer> arrlst = Arrays.asList(nums[i], nums[j], -(nums[i]+nums[j]));
                    Collections.sort(arrlst);
                    lst.add(arrlst);
                }
                set.add(nums[j]);
                
            }
        }
        return new ArrayList<>(lst);
    }
}