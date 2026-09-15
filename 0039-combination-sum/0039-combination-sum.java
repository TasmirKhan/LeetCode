class Solution {
    public void helper(int[]nums, int target,int sum,  int idx , List<Integer> demo, List<List<Integer>> lst){
        
            if(target == sum) {lst.add(new ArrayList<>(demo));
            return ;
            }
            if(idx == nums.length || sum > target){ return ;}

        demo.add(nums[idx]);
        helper(nums, target, sum + nums[idx], idx, demo, lst);

        demo.remove(demo.size() - 1);
        

        helper(nums, target, sum, idx + 1, demo, lst);


    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> lst = new ArrayList<>();
        List<Integer> demo = new ArrayList<>();
        helper(candidates,target, 0, 0, demo, lst);
        return lst;
    }
}