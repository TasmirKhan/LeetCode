class Solution {
   
    public List<List<Integer>> subsets(int[] nums) {
          int n = nums.length;
        int i = 0 ; 
        List<List<Integer>> lst = new ArrayList<>();
       backtrack(nums, i, new ArrayList<>(),lst);
        return lst ;
    }

    public static void backtrack(int[] nums, int i , ArrayList<Integer> temp, List<List<Integer>> lst){
        if(i>= nums.length){
            lst.add(new ArrayList<Integer>(temp));
            return ;
        }

        temp.add(nums[i]);
        backtrack(nums,i+1,temp,lst);
        temp.remove(temp.size() - 1);
        backtrack(nums,i+1,temp,lst);
    }
}