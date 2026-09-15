class Solution {

    private void helper(int[] nums, int k , int idx, List<List<Integer>> lst, List<Integer> demo){
        if(k == 0) {
            lst.add(new ArrayList<>(demo)); return ;
        }

        for(int i = idx ; i< nums.length ; i++){
            if(i > idx && nums[i] == nums[i-1]){
                continue;
            }

            if(nums[i] > k){
                break ;
            }

            demo.add(nums[i]);
            helper(nums, k - nums[i] , i + 1, lst, demo );
            demo.remove(demo.size() - 1);
        }
        // if(idx == nums.length || sum > k){ return ; }

        // demo.add(nums[idx]);
        // helper(nums,k ,sum + nums[idx] , idx + 1, lst, demo);
        // demo.remove(demo.size() - 1);
        // helper(nums, k , sum , idx + 1, lst, demo);
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> lst = new ArrayList<>();
        List<Integer> demo = new ArrayList<>();
        helper(candidates, target, 0 , lst, demo);
        return lst;
    }
}