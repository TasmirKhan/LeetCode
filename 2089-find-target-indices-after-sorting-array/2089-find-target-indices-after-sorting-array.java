class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {

        int[] arr = new int[101];   

        for(int num : nums){
            arr[num]++;
        }
        
        List<Integer> lst = new ArrayList<>();
        int idx = -1;
        for(int i = 1 ; i<101 ; i++){
            if(i < target && arr[i] != 0){
                idx += arr[i];
                
            }
            else if(i == target){
                int temp = idx + arr[i];
                idx++;
                while(idx <= temp){ lst.add(idx); idx++; }
                break;
            }
        }

        return lst;

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