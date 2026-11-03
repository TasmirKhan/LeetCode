class Solution {
    public int minIncrementForUnique(int[] nums) {
        
        Arrays.sort(nums);
        int prev = -1;
        int move = 0;
        int n = nums.length;

        for(int i =0 ; i < n; i++){
         if(nums[i] <= prev){
            move += prev - nums[i]+1;
            prev += 1;
         }
         else{
         prev = nums[i];
         }
        }

        return move;

        // TLE
        // Set<Integer> set = new HashSet<>();
        // List<Integer> lst = new ArrayList<>();

        // for(int num : nums){
        //     if(!set.contains(num)){set.add(num);}
        //     else{lst.add(num);}
        // }

        // int cnt = 0;
        // for(int i = 0 ; i < lst.size(); i++){

        //     while(set.contains(lst.get(i))){
        //         lst.set(i,lst.get(i)+1);
        //         cnt++;
        //     }

        //     set.add(lst.get(i));
        // }

        // return cnt;



    }
}