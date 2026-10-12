class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] arr = new int[101];
        int allZero = nums.length;
        List<Integer> lst = new ArrayList<>();
        for(int num : nums){
            arr[num]++;
        }

        while(allZero > 0){
            for(int i = 0 ; i<101 ; i++){
               if(arr[i] != 0){
                lst.add(i);
                arr[i]--;
                allZero--;
               }
            }
        }

        return lst.stream().mapToInt(Integer::intValue).toArray();

    }
}