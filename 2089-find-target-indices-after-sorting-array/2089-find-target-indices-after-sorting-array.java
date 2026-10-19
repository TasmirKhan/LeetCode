class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        // Approach 1. Using idea of counting less numbers and target values;
        int nlower = 0;
        int ntarget = 0;

        List<Integer> lst = new ArrayList<>();
        for(int num : nums){
            if(num < target){nlower++;}
            else if(num == target){ntarget++;}
        }

        for(int i = 0 ; i<ntarget ; i++){
            lst.add(nlower+i);
        }

        return lst;



        // Approach 2. Using another array to track elements;
        // int[] arr = new int[101];   

        // for(int num : nums){
        //     arr[num]++;
        // }
        
        // List<Integer> lst = new ArrayList<>();
        // int idx = -1;
        // for(int i = 1 ; i<101 ; i++){
        //     if(i < target && arr[i] != 0){
        //         idx += arr[i];                
        //     }
        //     else if(i == target){
        //         int temp = idx + arr[i];
        //         idx++;
        //         while(idx <= temp){ lst.add(idx); idx++; }
        //         break;
        //     }
        // }

        // return lst;

        // 2. Approach Sorting + Indexing 
        // Arrays.sort(nums);
        // List<Integer> lst = new ArrayList<>();
        // int n = nums.length;
        // int idx = 0;
        // boolean found = false;
        // for(int i = 0 ; i < n ; i++){
            
        //    if(nums[i] == target){
        //         lst.add(i);
        //     }
        // }
        // return lst;
    }
}