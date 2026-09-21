class Solution {

    private void helper(int[] nums, int idx , List<Integer> demo, List<List<Integer>> lst){
    
            lst.add(new ArrayList<Integer>(demo));

        for(int i = idx ; i<nums.length ; i++){
        demo.add(nums[i]);
        helper(nums,i+1, demo, lst);
        demo.remove(demo.size() - 1);
        }
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> lst = new ArrayList<>();
        List<Integer> demo = new ArrayList<>();
        
        helper(nums,0,demo, lst);
        return lst;
    }
}