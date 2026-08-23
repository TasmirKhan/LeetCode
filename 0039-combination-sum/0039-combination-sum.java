class Solution {
    private void backtrack(int index, int remaining, int[] arr, List<Integer> path, List<List<Integer>> res){
        if(remaining == 0){
            res.add(new ArrayList<>(path));
            return ;
        }

        if(index == arr.length || remaining < 0) return ;

        path.add(arr[index]);
        backtrack(index, remaining - arr[index], arr, path , res);
        path.remove(path.size() - 1);
        backtrack(index+1,remaining,arr,path,res);

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> lst = new ArrayList<>();
        backtrack(0, target, candidates, new ArrayList<>(), lst);
        return lst;
    }
}