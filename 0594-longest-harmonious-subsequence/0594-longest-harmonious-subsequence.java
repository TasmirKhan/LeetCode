class Solution {
    public int findLHS(int[] nums) {
        // Approach 1. Using Sorting + Sliding Window
        Arrays.sort(nums);
        int n = nums.length;
        int i = 0, j = 0;
        int max = 0;
        while(i < n && j < n){
            while(i < n && nums[j] - nums[i] > 1){i++;}
            
            if(j < n && nums[j] - nums[i] == 1){ 
                int diff = j - i + 1;
                max = Math.max(max,diff);
            }
            j++;
        }
        return max;


        // Approach 2. Using HashMap Data Structure
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for(int num : nums){
        //     map.put(num , map.getOrDefault(num, 0) + 1);
        // }

        // int max = 0;
        // for(Map.Entry<Integer,Integer> entry : map.entrySet() ){
        //         int key = entry.getKey();
        //         int val = entry.getValue();

        //         if(map.containsKey(key+1)){
        //             int ans = val + map.get(key+1);
        //             max = Math.max(max,ans);
        //         }
        // }

        // return max;
    }
}