class Solution {

    private void helper(int[] nums, int idx , List<Integer> demo, List<List<Integer>> lst){
        if(idx  == nums.length){
            lst.add(new ArrayList<Integer>(demo));
            return ;
        }

        demo.add(nums[idx]);
        helper(nums,idx+1, demo, lst);
        demo.remove(demo.size() - 1);
        helper(nums,idx+1, demo, lst);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> lst = new ArrayList<>();
        List<Integer> demo = new ArrayList<>();
        int n = nums.length;
        helper(nums,0,demo, lst);
        return lst;
    }
}