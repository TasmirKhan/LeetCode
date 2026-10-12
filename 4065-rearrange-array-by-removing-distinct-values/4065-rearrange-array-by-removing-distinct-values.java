class Solution {
    public int[] rearrangeArray(int[] nums) {

        int[] arr = new int[101];
        int allZero = nums.length;
        
        int[] res = new int[allZero];
        for(int num : nums){
            arr[num]++;
        }
        int a = 0;
        while(allZero > 0){
            for(int i = 0 ; i<101 ; i++){
               if(arr[i] != 0){
               res[a++] = i;
                arr[i]--;
                allZero--;
               }
            }
        }
        return res;
        // return lst.stream().mapToInt(Integer::intValue).toArray();

    }
}