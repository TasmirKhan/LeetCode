class Solution {
    public int removeDuplicates(int[] arr) {
        
        int i = 1 ;
        int j = 1 ;

        while(i<arr.length){
            if(arr[i-1] != arr[i]){arr[j] = arr[i]; j++; i++;}
            else {i++;}
        }
        return j;
        //Set<Integer> set = new HashSet<>();
        // while(i<nums.length){
        //     if(!set.contains(nums[i])){
        //         nums[j] = nums[i];
        //         set.add(nums[i]);
        //         j++;
        //     }
        //     i++;
        // }
        // return j;
    }
}